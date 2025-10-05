package org.spring.mvc.service.impl;

import lombok.RequiredArgsConstructor;
import org.spring.mvc.domain.FilmEntity;
import org.spring.mvc.dto.FilmDto;
import org.spring.mvc.mapper.FilmMapper;
import org.spring.mvc.repository.FilmRepository;
import org.spring.mvc.service.FilmService;
import org.springframework.stereotype.Service;

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
    public List<FilmDto> findAll() {
        List<FilmEntity> all = repository.findAll();
        return mapper.toDto(all);
    }

    @Override
    public List<FilmDto> findByName(String name) {
        var result=repository.findByName(name);
        return mapper.toDto(result);
    }
}
