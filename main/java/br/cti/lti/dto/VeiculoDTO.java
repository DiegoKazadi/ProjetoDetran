/**
 * 
 */
package br.cti.lti.dto;

import java.util.Date;

/**
 * @author ctis
 *
 */
public class VeiculoDTO {

	private String placa;
	private String cor;
	private String chassi;
	private Date data;

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	/**
	 * @return the chassi
	 */
	public String getChassi() {
		return chassi;
	}

	/**
	 * @param chassi the chassi to set
	 */
	public void setChassi(String chassi) {
		this.chassi = chassi;
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

	@Override
	public String toString() {
		return "VeiculoDTO [placa=" + placa + ", cor=" + cor + ", chassi=" + chassi + ", data=" + data + "]";
	}

}
