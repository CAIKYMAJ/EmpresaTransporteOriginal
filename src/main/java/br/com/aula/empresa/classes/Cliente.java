package br.com.aula.empresa.classes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String codigoCli;

    @NotBlank
    private String dataInscrisao;

    @NotBlank
    private String endereco;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String telefone;
}