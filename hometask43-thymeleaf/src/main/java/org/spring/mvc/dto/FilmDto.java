package org.spring.mvc.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class FilmDto {
    @NotBlank
    private String name;
    @NotNull
    @Min(1)
    private Integer duration;
}
