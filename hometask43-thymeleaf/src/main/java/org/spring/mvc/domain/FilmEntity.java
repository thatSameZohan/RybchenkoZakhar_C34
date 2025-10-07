package org.spring.mvc.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Table(name="films")
@Entity
@NoArgsConstructor
@Setter @Getter
public class FilmEntity {
    @Id
    @UuidGenerator
    private UUID id;
    private String name;
    private Integer duration;
    private String description;

}
