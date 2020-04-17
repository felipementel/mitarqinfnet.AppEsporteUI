package br.com.AppEsporteUI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AppEsporteUI.model.ItemVenda;
import br.com.AppEsporteUI.repository.IItemVendaRepository;

@Service
public class ItemVendaService {

	@Autowired
	private IItemVendaRepository repository;

	public IItemVendaRepository getRepository() {
		return repository;
	}

	public void setRepository(IItemVendaRepository repository) {
		this.repository = repository;
	}

	public List<ItemVenda> obterLista() {
		return (List<ItemVenda>) repository.findAll();
	}

	public Optional<ItemVenda> obterPorId(Integer id) {
		return repository.findById(id);
	}

	public void incluir(ItemVenda itemVenda) {
		repository.save(itemVenda);
	}

	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}