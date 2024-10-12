package com.jnu.festival.domain.booth.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Period {
    DAYTIME("Daytime"),
    NIGHTTIME("Nighttime"),
    FULLTIME("Fulltime");

    private final String period;
}