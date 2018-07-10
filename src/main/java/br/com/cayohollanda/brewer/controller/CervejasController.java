/**
 * 
 */
package br.com.cayohollanda.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
}
