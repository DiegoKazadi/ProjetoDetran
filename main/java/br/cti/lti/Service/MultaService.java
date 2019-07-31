/**
 * 
 */
package br.cti.lti.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cti.lti.dto.MultaDTO;
import br.cti.lti.models.Multa;
import br.cti.lti.repository.MultaRepository;

/**
 * @author ctis
 *
 */
@Service
public class MultaService {
	
	@Autowired
	private MultaRepository multaRepository;
	
	public List<Multa> listarMulta() {
		
		return multaRepository.findAll();
	}
	
	public void salvarMulta(Multa multa) {
		multaRepository.save(multa);
	}
	
	public void deletarMultaPorId(Long id) {
		multaRepository.deleteById(id);
	}
	
	public void atualizarMulta(Multa id) {
		multaRepository.save(id);
	}
	public MultaDTO buscarMultaPorId (Long id) {
		Multa multa = multaRepository.findById(id).get();
		MultaDTO dto = new MultaDTO();
		dto.setData(multa.getData());
		dto.setId(multa.getId());
		dto.setPontos(multa.getPontos());
		dto.setValor(multa.getValor());
		return dto;
	}
	
}
