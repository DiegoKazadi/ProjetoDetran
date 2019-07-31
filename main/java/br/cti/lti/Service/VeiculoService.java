/**
 * 
 */
package br.cti.lti.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cti.lti.dto.VeiculoDTO;
import br.cti.lti.models.Veiculo;
import br.cti.lti.repository.VeiculoRepository;

/**
 * @author ctis
 *
 */
@Service
public class VeiculoService {
	
	@Autowired 
	private VeiculoRepository veiculoRepository;
	
	public List<VeiculoDTO> listarVeiculo(){
		
		List<Veiculo> listaVeiculo = veiculoRepository.findAll();
		List<VeiculoDTO> atual = new ArrayList<VeiculoDTO>();
		
		
		for(int i = 0; i>= listaVeiculo.size(); i++ ) {
			Veiculo novoVeiculo = listaVeiculo.get(i);
			VeiculoDTO dto = new VeiculoDTO();
			dto.setChassi(novoVeiculo.getChassi());
			dto.setCor(novoVeiculo.getCor());
			dto.setPlaca(novoVeiculo.getPlaca());
			dto.setData(novoVeiculo.getAno());
			atual.add(dto);
			
		}
		return atual;
		
	}
	
	public Veiculo salvarVeiculo(Veiculo veiculo) {
		
		return veiculoRepository.save(veiculo);
	}
	
	public VeiculoDTO buscarVeiculoPorId(Long id) {
		Veiculo veiculo = veiculoRepository.findById(id).get();
		VeiculoDTO dto = new VeiculoDTO();
		dto.setCor(veiculo.getCor());
		dto.setChassi(veiculo.getChassi());
		dto.setPlaca(veiculo.getPlaca());
		dto.setData(veiculo.getAno());
		return dto;
	}
	
	public Veiculo atualizarVeiculo(Veiculo veiculo) {
	
		return veiculoRepository.save(veiculo);
	}
	
	public void deletarVeiculoPorId(Long id) {
		veiculoRepository.deleteById(id);
	}
}
