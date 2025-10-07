package org.spring.mvc.repository;

import org.spring.mvc.domain.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.UUID;

public interface FilmRepository extends JpaRepository<FilmEntity, UUID>, JpaSpecificationExecutor<FilmEntity> {

    FilmEntity findByName(String name);
}
