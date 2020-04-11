package br.com.AppEsporteUI.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AppEsporteUI.model.Cliente;
import br.com.AppEsporteUI.repository.IClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private IClienteRepository repository;

	public boolean isValid(String login, String senha) {
		return "admin".equalsIgnoreCase(login) && "admin".equalsIgnoreCase(senha);
	}

	public List<Cliente> obterLista() {
		return (List<Cliente>) repository.findAll();
	}

	public Optional<Cliente> obterPorId(Integer id) {
		return repository.findById(id);
	}

	public void incluir(Cliente cliente) {
		
		cliente.setDatacadastro(new Date());
		cliente.setIsativo(true);
		
		repository.save(cliente);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}
