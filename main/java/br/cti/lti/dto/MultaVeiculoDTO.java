/**
 * 
 */
package br.cti.lti.dto;

import java.util.ArrayList;
import java.util.List;

import br.cti.lti.models.Multa;

/**
 * @author ctis
 *
 */
public class MultaVeiculoDTO {
	
	private String placa;
	private  String proprietarioNome;
	private List<Multa> multa = new ArrayList<Multa>();
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
	 * @return the proprietarioNome
	 */
	public String getProprietarioNome() {
		return proprietarioNome;
	}
	/**
	 * @param proprietarioNome the proprietarioNome to set
	 */
	public void setProprietarioNome(String proprietarioNome) {
		this.proprietarioNome = proprietarioNome;
	}
	/**
	 * @return the multa
	 */
	public List<Multa> getMulta() {
		return multa;
	}
	/**
	 * @param multa the multa to set
	 */
	public void setMulta(List<Multa> multa) {
		this.multa = multa;
	}
	

}
