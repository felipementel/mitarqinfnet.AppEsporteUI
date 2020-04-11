package br.com.AppEsporteUI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AppEsporteUI.model.Produto;
import br.com.AppEsporteUI.repository.IProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private IProdutoRepository repository;
	
	public List<Produto> obterLista(){
		return (List<Produto>)repository.findAll();
	}	
	
	public Optional<Produto> obterPorId(Integer id) {
		return repository.findById(id);
	}	
		
	public void incluir(Produto produto) {
		repository.save(produto);		
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}