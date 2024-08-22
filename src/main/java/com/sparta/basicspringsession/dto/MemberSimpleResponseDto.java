package com.sparta.basicspringsession.dto;

import lombok.Getter;

@Getter
public class MemberSimpleResponseDto {

    private final String name;

    public MemberSimpleResponseDto(final String name) {
        this.name = name;
    }
}
