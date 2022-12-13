package io.github.guimendes.clientes.model.repository;

import io.github.guimendes.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServicoReposity extends JpaRepository<Servico, Integer> {
}
