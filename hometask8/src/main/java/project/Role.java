package project;

import lombok.Getter;

@Getter
public enum Role {
    DEVELOPER(2000),
    TEAMLEAD(4000);

    private final int baseSalary;

    private Role(int baseSalary) {
        this.baseSalary = baseSalary;
    }

}
