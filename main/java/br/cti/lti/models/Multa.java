/**
 * 
 */
package br.cti.lti.models;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author ctis
 *
 */
@Entity
public class Multa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "multa_id")
	private Long id;
	
	
	private double valor;
	private Date data;
	private String tipo;
	private Integer pontos;
	
	
	@ManyToOne
	@JoinColumn (name = "proprietario_id")
	private Proprietario proprietario;
	
	
	@ManyToOne
	@JoinColumn(name = "veiculo_id")
	private Veiculo veiculo;
	
	
	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	
	@Override
	public int hashCode() {
		return Objects.hash(data, id, pontos, proprietario, tipo, valor, veiculo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multa other = (Multa) obj;
		return Objects.equals(data, other.data) && id == other.id
				&& Double.doubleToLongBits(pontos) == Double.doubleToLongBits(other.pontos)
				&& Objects.equals(proprietario, other.proprietario) && Objects.equals(tipo, other.tipo)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor)
				&& Objects.equals(veiculo, other.veiculo);
	}
	@Override
	public String toString() {
		return "Multa [id=" + id + ", valor=" + valor + ", data=" + data + ", tipo=" + tipo + ", pontos=" + pontos
				+ ", proprietario=" + proprietario + ", veiculo=" + veiculo + "]";
	}
	
}
