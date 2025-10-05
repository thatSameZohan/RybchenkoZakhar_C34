package org.spring.mvc.repository;

import org.spring.mvc.domain.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface FilmRepository extends JpaRepository<FilmEntity, UUID> {

    List<FilmEntity> findByName(String name);
}
