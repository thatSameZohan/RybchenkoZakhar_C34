package org.spring.mvc.service.impl;

import jakarta.persistence.criteria.Predicate;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.spring.mvc.domain.FilmEntity;
import org.spring.mvc.dto.FilmDto;
import org.spring.mvc.dto.FilmSearchDto;
import org.spring.mvc.mapper.FilmMapper;
import org.spring.mvc.repository.FilmRepository;
import org.spring.mvc.service.FilmService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {

    private final FilmRepository repository;
    private final FilmMapper mapper;

    @Override
    public void save(FilmDto dto) {
        FilmEntity entity = mapper.toEntity(dto);
        repository.save(entity);
    }

    @Override
    public void delete(String name) {
        FilmEntity entity = repository.findByName(name);
        repository.delete(entity);
    }

    @Override
    public List<FilmDto> findAll() {
        List<FilmEntity> all = repository.findAll();
        return mapper.toDto(all);
    }

    @Override
    public List<FilmDto> findByCriteria(FilmSearchDto dto) {
        Specification<FilmEntity> specification = createSpecification(dto);
        List<FilmEntity> result = repository.findAll(specification);
        return mapper.toDto(result);

    }

    private Specification<FilmEntity> createSpecification(FilmSearchDto dto) {
        return (root, query, builder) ->{
            List<Predicate> predicates = new ArrayList<>();
            if(StringUtils.isNoneBlank(dto.getName())){
                predicates.add(builder.equal(root.get("name"), dto.getName()));
            }
            if(dto.getDurationFrom()!=null){
                predicates.add(builder.greaterThanOrEqualTo(root.get("duration"), dto.getDurationFrom()));
            }
            if(dto.getDurationTo()!=null){
                predicates.add(builder.lessThanOrEqualTo(root.get("duration"), dto.getDurationTo()));
            }
            if(StringUtils.isNoneBlank(dto.getDescription())){
                predicates.add(builder.like(root.get("description"), "%"+dto.getDescription()+"%"));
            }
            return builder.and(predicates.toArray(new Predicate[]{}));
        };
    }
}
