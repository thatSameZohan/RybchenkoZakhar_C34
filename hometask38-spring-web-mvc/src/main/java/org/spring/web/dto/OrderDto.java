package org.spring.web.dto;

import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDto {
    private String name;
    private String description;
}
