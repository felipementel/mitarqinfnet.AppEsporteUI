package br.com.AppEsporteUI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.AppEsporteUI.model.Bicicleta;
import br.com.AppEsporteUI.service.BicicletaService;
import br.com.AppEsporteUI.service.ProdutoService;

@Controller
public class ProdutoController {

	@Autowired
	BicicletaService serviceBicicleta;

	@Autowired
	ProdutoService serviceProduto;
	
	@RequestMapping(value = "/bicicleta/lista", method = RequestMethod.GET)
	public String showBicicleta(Model model) {

		model.addAttribute("bicicletas", serviceBicicleta.obterLista());

		return "bicicleta/lista";
	}
	
	@RequestMapping(value = "/bicicleta/cadastro", method = RequestMethod.GET)
	public String cadastroBicicleta(Model model) {

		return "/bicicleta/cadastro";
	}

	@RequestMapping(value = "/bicicleta/cadastro", method = RequestMethod.POST)
	public String cadastroBicicleta(Model model, Bicicleta bicicleta) {

		serviceBicicleta.incluir(bicicleta);

		return showBicicleta(model);
	}
	
	@RequestMapping(value = "/bicicleta/excluir/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {

		serviceBicicleta.excluir(id);

		return this.showBicicleta(model);
	}
}
