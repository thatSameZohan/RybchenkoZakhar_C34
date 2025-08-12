package com.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter

public class Route {

    private Integer id;
    private String name;
    private String body;
    private Integer length;
    private Integer likes;

    public Route(String name, String body, Integer length, Integer likes) {
        this.name = name;
        this.body = body;
        this.length = length;
        this.likes=likes;
    }

}
