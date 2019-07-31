/**
 * 
 */
package br.cti.lti.dto;

import java.util.ArrayList;
import java.util.List;

import br.cti.lti.models.Endereco;
import br.cti.lti.models.Veiculo;

/**
 * @author ctis
 *
 */
public class ProprietarioDTO {
	
	private String nome;
	private String cpf;
	private Endereco endereco;
	private List<Veiculo> veiculo = new ArrayList<Veiculo>();
	
	
	public ProprietarioDTO() {
		super();
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
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	/**
	 * @return the veiculo
	 */
	public List<Veiculo> getVeiculo() {
		return veiculo;
	}
	/**
	 * @param veiculo the veiculo to set
	 */
	public void setVeiculo(List<Veiculo> veiculo) {
		this.veiculo = veiculo;
	}
	@Override
	public String toString() {
		return "ProprietarioDTO [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", veiculo=" + veiculo
				+ "]";
	}
	
	
}
