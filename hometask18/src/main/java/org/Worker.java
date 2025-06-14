package org;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
@ToString
public class Worker {
    private int salary;
    private Profession profession;

}
