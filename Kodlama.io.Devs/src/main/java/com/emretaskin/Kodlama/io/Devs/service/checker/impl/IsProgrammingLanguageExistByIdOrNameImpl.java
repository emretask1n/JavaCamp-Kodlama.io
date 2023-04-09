package com.emretaskin.Kodlama.io.Devs.service.checker.impl;

import com.emretaskin.Kodlama.io.Devs.entity.ProgrammingLanguage;
import com.emretaskin.Kodlama.io.Devs.exception.ProgrammingLanguageAlreadyExistsException;
import com.emretaskin.Kodlama.io.Devs.repository.ProgrammingLanguageRepository;
import com.emretaskin.Kodlama.io.Devs.service.checker.interfaces.IsProgrammingLanguageExistByIdOrName;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class IsProgrammingLanguageExistByIdOrNameImpl implements IsProgrammingLanguageExistByIdOrName {
    private final ProgrammingLanguageRepository programmingLanguageRepository;
    @Override
    public void check(Long id, String name) {
        checkIsProgrammingLanguageExistById(id);
        checkIsProgrammingLanguageExistByName(name);
    }

    private void checkIsProgrammingLanguageExistById(Long id) {
        Optional<ProgrammingLanguage> programmingLanguage = programmingLanguageRepository.findById(id);
        if(programmingLanguage.isPresent()){
            throw new ProgrammingLanguageAlreadyExistsException("Programming Language already exists with id : " + id );
        }
    }

    private void checkIsProgrammingLanguageExistByName(String name){
        Optional<ProgrammingLanguage> programmingLanguage = programmingLanguageRepository.findByName(name);
        if(programmingLanguage.isPresent()){
            throw new ProgrammingLanguageAlreadyExistsException("Programming Language already exists with name : " + name);
        }
    }
}
