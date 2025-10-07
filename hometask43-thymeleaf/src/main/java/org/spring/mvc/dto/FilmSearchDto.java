package org.spring.mvc.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class FilmSearchDto {

    private String name;
    private Integer durationFrom;
    private Integer durationTo;
    private String description;
}
