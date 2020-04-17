package br.com.AppEsporteUI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.AppEsporteUI.model.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Integer> {

}
