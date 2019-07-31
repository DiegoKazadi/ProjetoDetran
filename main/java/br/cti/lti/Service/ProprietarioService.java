/**
 * 
 */
package br.cti.lti.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cti.lti.dto.ProprietarioDTO;
import br.cti.lti.models.Proprietario;
import br.cti.lti.models.Veiculo;
import br.cti.lti.repository.ProprietarioRepository;
import br.cti.lti.repository.VeiculoRepository;

/**
 * @author ctis
 *
 */
@Service
public class ProprietarioService {
	
	
	@Autowired
	private ProprietarioRepository proprietarioRepository;
	
	@Autowired 
	private VeiculoRepository veiculoRepository;

	public ProprietarioDTO listarPorId(Long id) {
		Proprietario proprietario = proprietarioRepository.findById(id).get();
		
		ProprietarioDTO dto = new ProprietarioDTO(); 
		Veiculo veiculoTemp = new Veiculo();
		veiculoTemp.setPlaca(proprietario.ge);
		dto.setNome(proprietario.getNome());
		dto.setEndereco(proprietario.getEndereco());
		dto.setVeiculo(proprietario.);
		
		return dto;
	}
	
	
	

	

}
