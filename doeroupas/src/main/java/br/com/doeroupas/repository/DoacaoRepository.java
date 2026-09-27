package br.com.doeroupas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.doeroupas.entity.Doacao;

public interface DoacaoRepository extends JpaRepository<Doacao, Long> {

}