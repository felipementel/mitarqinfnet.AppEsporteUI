package br.com.AppEsporteUI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AppEsporteUI.model.Skate;
import br.com.AppEsporteUI.repository.ISkateRepository;

@Service
public class SkateService {
	
	@Autowired
	private ISkateRepository repository;
	
	public List<Skate> obterLista(){
		return (List<Skate>)repository.findAll();
	}	
	
	public Optional<Skate> obterPorId(Integer id) {
		return repository.findById(id);
	}	
		
	public void incluir(Skate skate) {
		repository.save(skate);		
	}
	
	public void excluir(Integer id) {
		repository.deleteById(id);
	}
}