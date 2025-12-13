package com.ilehmann.springboot.cursobackend.utils;

import org.springframework.stereotype.Component;

@Component
public class StringUtils {

    public boolean isEmpty(String textValidate) {
        return textValidate == null || textValidate.isBlank();
    }

    public static boolean validation(String textValidate) {
        return true;
    }

}
