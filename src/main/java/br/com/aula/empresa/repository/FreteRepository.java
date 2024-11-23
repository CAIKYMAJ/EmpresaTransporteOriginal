package br.com.aula.empresa.repository;

import br.com.aula.empresa.classes.Frete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreteRepository extends JpaRepository<Frete, Long> {
}
