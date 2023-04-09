package com.emretaskin.Kodlama.io.Devs.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "programming_languages")
public class ProgrammingLanguage {

    @Id
    private Long id;
    private String name;
}

