package com.dto;

import com.entity.CarEntity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class SearchDto {

    private CarEntity.Brand brand;
    private Long fromCost;
    private Long toCost;
    private Integer fromMileage;
    private Integer toMileage;
    private Integer fromYear;

}
