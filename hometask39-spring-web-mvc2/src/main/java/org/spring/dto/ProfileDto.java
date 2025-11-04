package org.spring.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProfileDto {
    @NotBlank(message = "must be not blank")
    private String login;
    @NotBlank(message = "must be not blank")
    @Email (message = "not email format")
    private String email;
    @NotNull(message = "must be not blank")
    @Min(value = 18, message = "to small")
    @Max(value = 120, message = "too big")
    private Integer age;

}
