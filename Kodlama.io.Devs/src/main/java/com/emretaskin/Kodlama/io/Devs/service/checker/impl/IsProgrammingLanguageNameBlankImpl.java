package com.emretaskin.Kodlama.io.Devs.service.checker.impl;

import com.emretaskin.Kodlama.io.Devs.service.checker.interfaces.IsProgrammingLanguageNameBlank;
import org.springframework.stereotype.Component;

@Component
public class IsProgrammingLanguageNameBlankImpl implements IsProgrammingLanguageNameBlank {

    @Override
    public void check(String name) {
        if(name.isBlank()){
            throw new IllegalArgumentException("Programming Language name can not be empty!");
        }
    }
}
