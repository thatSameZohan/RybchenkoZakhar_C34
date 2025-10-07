package org.spring.mvc.service;

import org.spring.mvc.dto.FilmDto;
import org.spring.mvc.dto.FilmSearchDto;

import java.util.List;

public interface FilmService {

    void save (FilmDto dto);

    void delete(String name);

    List<FilmDto> findAll();

    List<FilmDto> findByCriteria(FilmSearchDto dto);

}
