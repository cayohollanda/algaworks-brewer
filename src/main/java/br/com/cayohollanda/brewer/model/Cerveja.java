/**
 * 
 */
package br.com.cayohollanda.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @author Cayo Hollanda (http://www.github.com/cayohollanda)
 *
 * @project springexperts
 */

public class Cerveja {

	@NotBlank(message="SKU é obrigatório")
	private String sku;
	
	@NotBlank(message="Nome é obrigatório")
	private String nome;
	
	@Size(min=1, max=50, message="O tamanho da descrição deve estar entre 1 e 50")
	private String descricao;
	
	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}
	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
