package com.book.bookstock.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookTypeEnum {
    FICTION("Fiction literature"),
    SELF_HELP("Self Help"),
    COMIC("Comic"),
    SCIENTIFIC("Scientific Books"),
    RELIGION("Religion");

    private final String description;
}
