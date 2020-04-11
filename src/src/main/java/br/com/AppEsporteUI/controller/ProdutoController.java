package br.com.AppEsporteUI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.AppEsporteUI.model.Bicicleta;
import br.com.AppEsporteUI.model.Bodyboard;
import br.com.AppEsporteUI.model.Skate;
import br.com.AppEsporteUI.service.BicicletaService;
import br.com.AppEsporteUI.service.BodyboardService;
import br.com.AppEsporteUI.service.SkateService;

@Controller
public class ProdutoController {

	@Autowired
	BicicletaService serviceBicicleta;

	@Autowired
	SkateService serviceSkate;

	@Autowired
	BodyboardService serviceBodyboard;

	/*
	 * @RequestMapping(value = "/home", method = RequestMethod.POST) public String
	 * showHome1() {
	 * 
	 * return "home"; }
	 */

	// Bicicleta
	@RequestMapping(value = "/produtos/bicicleta/lista", method = RequestMethod.GET)
	public String showBicicleta(Model model) {

		model.addAttribute("bicicletas", serviceBicicleta.obterLista());

		return "produtos/bicicleta/lista";
	}

	@RequestMapping(value = "/produtos/bicicleta/cadastro", method = RequestMethod.GET)
	public String cadastroBicicleta(Model model) {

		return "produtos/bicicleta/cadastro";
	}

	@RequestMapping(value = "/produtos/bicicleta/cadastro", method = RequestMethod.POST)
	public String cadastroBicicleta(Model model, Bicicleta bicicleta) {

		serviceBicicleta.incluir(bicicleta);

		return showBicicleta(model);
	}

	@RequestMapping(value = "/produtos/bicicleta/excluir/{id}", method = RequestMethod.GET)
	public String excluirBicicleta(Model model, @PathVariable Integer id) {

		serviceBicicleta.excluir(id);

		return this.showBicicleta(model);
	}

	// Skate
	@RequestMapping(value = "/produtos/skate/lista", method = RequestMethod.GET)
	public String showSkate(Model model) {

		model.addAttribute("skates", serviceSkate.obterLista());

		return "produtos/skate/lista";
	}

	@RequestMapping(value = "/produtos/skate/cadastro", method = RequestMethod.GET)
	public String cadastroSkate(Model model) {

		return "/produtos/skate/cadastro";
	}

	@RequestMapping(value = "/produtos/skate/cadastro", method = RequestMethod.POST)
	public String cadastroBicicleta(Model model, Skate skate) {

		serviceSkate.incluir(skate);

		return showSkate(model);
	}

	@RequestMapping(value = "/produtos/skate/excluir/{id}", method = RequestMethod.GET)
	public String excluirSkate(Model model, @PathVariable Integer id) {

		serviceSkate.excluir(id);

		return this.showSkate(model);
	}

	// Bodyboard
	@RequestMapping(value = "/produtos/bodyboard/lista", method = RequestMethod.GET)
	public String showBodyboard(Model model) {

		model.addAttribute("bodyboards", serviceBodyboard.obterLista());

		return "/produtos/bodyboard/lista";
	}

	@RequestMapping(value = "/produtos/bodyboard/cadastro", method = RequestMethod.GET)
	public String cadastroBodyboard(Model model) {

		return "/produtos/bodyboard/cadastro";
	}

	@RequestMapping(value = "/produtos/bodyboard/cadastro", method = RequestMethod.POST)
	public String cadastroBodyboard(Model model, Bodyboard bodyboard) {

		serviceBodyboard.incluir(bodyboard);

		return showBodyboard(model);
	}

	@RequestMapping(value = "/produtos/bodyboard/excluir/{id}", method = RequestMethod.GET)
	public String excluirBodyboard(Model model, @PathVariable Integer id) {

		serviceBodyboard.excluir(id);

		return this.showBodyboard(model);
	}
}
