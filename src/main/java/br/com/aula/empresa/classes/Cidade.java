package br.com.aula.empresa.classes;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String nome;

    @NotBlank
    @Column(nullable = false, unique = true)
    private String codigo;

    @NotNull
    private Double precoUnitPeso;

    @NotNull
    private Double precoUnitValor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "estado_id")
    private Estado estado;
}