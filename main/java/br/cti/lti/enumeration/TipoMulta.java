/**
 * 
 */
package br.cti.lti.enumeration;

/**
 * @author ctis
 *
 */
public enum TipoMulta {
	
	GRAVISSIMA, 
	GRAVE, 
	MEDIA, 
	LEVE;
	
	private double tipoMulta;
	
	public void multarVeiculo (TipoMulta tipoMulta) {
		
		if (tipoMulta == GRAVISSIMA) {
			this.tipoMulta = 293.47;
			
		} else if (tipoMulta == GRAVE) {
			this.tipoMulta = 195.23;
			
		} else if (tipoMulta == MEDIA) {
			this.tipoMulta = 130.16;
			
		} else if (tipoMulta == LEVE) {
			this.tipoMulta = 88.38;
		}
	}
	
	/**
	 * @return the tipoMulta
	 */
	public double getTipoMulta() {
		return tipoMulta;
	}

	/**
	 * @param tipoMulta the tipoMulta to set
	 */
	public void setTipoMulta(double tipoMulta) {
		this.tipoMulta = tipoMulta;
	}
}

