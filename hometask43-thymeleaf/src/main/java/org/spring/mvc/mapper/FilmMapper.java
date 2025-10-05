package org.spring.mvc.mapper;

import org.mapstruct.Mapper;
import org.spring.mvc.domain.FilmEntity;
import org.spring.mvc.dto.FilmDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FilmMapper {
    FilmEntity toEntity(FilmDto dto);
    FilmDto toDto(FilmEntity entity);
    List<FilmDto> toDto(List<FilmEntity> entities);
}
