package br.com.aula.empresa.classes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String nome;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String uf;

    @NotNull
    private Double icmsLocal;

    @NotNull
    private Double icmsOutroUf;
}