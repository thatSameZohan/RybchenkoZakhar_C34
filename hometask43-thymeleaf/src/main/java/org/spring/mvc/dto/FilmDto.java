package org.spring.mvc.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class FilmDto {
    private UUID id;
    @NotBlank
    private String name;
    @NotNull
    @Min(1)
    private Integer duration;
    @NotBlank
    private String description;
}
