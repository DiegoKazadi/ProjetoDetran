/**
 * 
 */
package br.cti.lti.dto;

import java.util.Date;

/**
 * @author ctis
 *
 */
public class MultaDTO {
	
	private Long id;
	private Date data;
	private Double valor;
	private Integer pontos;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the data
	 */
	public Date getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Date data) {
		this.data = data;
	}
	/**
	 * @return the valor
	 */
	public Double getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}
	/**
	 * @return the pontos
	 */
	public Integer getPontos() {
		return pontos;
	}
	/**
	 * @param pontos the pontos to set
	 */
	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}
	

}
