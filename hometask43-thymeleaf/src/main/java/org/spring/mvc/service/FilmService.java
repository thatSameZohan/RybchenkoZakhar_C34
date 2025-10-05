package org.spring.mvc.service;

import org.spring.mvc.dto.FilmDto;

import java.util.List;

public interface FilmService {

    void save (FilmDto dto);

    List<FilmDto> findAll();

    List<FilmDto> findByName(String name);
}
