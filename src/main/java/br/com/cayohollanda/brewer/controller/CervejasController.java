/**
 * 
 */
package br.com.cayohollanda.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.cayohollanda.brewer.model.Cerveja;

/**
 * @author Cayo Hollanda (http://www.github.com/cayohollanda)
 *
 * @project springexperts
 */

@Controller
public class CervejasController {

	@RequestMapping("/cervejas/novo")
	public String novo() {
		return "cerveja/CadastroCervejas";
	}
	
	@RequestMapping(value="/cervejas/novo", method=RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("mensagem", "Erro no formulário!");
			return "cerveja/CadastroCervejas";
		}
		
		model.addAttribute("mensagem", "Cerveja salva com sucesso!");
		return "cerveja/CadastroCervejas";
	}
	
}
