package com.emretaskin.Kodlama.io.Devs.service.interfaces;

import com.emretaskin.Kodlama.io.Devs.dto.request.ProgrammingLanguageRequest;
import com.emretaskin.Kodlama.io.Devs.dto.response.ProgrammingLanguageResponse;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguageResponse> listAllProgrammingLanguageNames();

    ProgrammingLanguageResponse getProgrammingLanguageNameById(Long id);

    ProgrammingLanguageResponse createProgrammingLanguage(ProgrammingLanguageRequest programmingLanguageRequest);

    ProgrammingLanguageResponse deleteProgrammingLanguageById(Long id);

    ProgrammingLanguageResponse updateProgrammingLanguage(ProgrammingLanguageRequest programmingLanguageRequest);
}
