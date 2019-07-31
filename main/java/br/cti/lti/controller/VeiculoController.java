/**
 * 
 */
package br.cti.lti.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cti.lti.Service.VeiculoService;
import br.cti.lti.dto.VeiculoDTO;
import br.cti.lti.models.Veiculo;

/**
 * @author ctis
 *
 */
@RestController
@RequestMapping("veiculo")
public class VeiculoController {
	
	@Autowired
	private VeiculoService veiculoService;
	
	
	@GetMapping("{id}")
	public ResponseEntity<VeiculoDTO> buscarVeiculoPorId(@PathVariable Long id){
		return new ResponseEntity<VeiculoDTO> (veiculoService.buscarVeiculoPorId(id), HttpStatus.OK);
		
	}
	
	@GetMapping
	public ResponseEntity<List<VeiculoDTO>> listarVeiculoPelaPlaca() {
		return new ResponseEntity<List<VeiculoDTO>> (veiculoService.listarVeiculo(), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Veiculo> deletarVeiculoPorId(@PathVariable Long id) {
		veiculoService.deletarVeiculoPorId(id);
		return new ResponseEntity<Veiculo> (HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Veiculo> atualizarVeiculo(@RequestBody  Veiculo veiculo) {
		veiculoService.salvarVeiculo(veiculo);
		return new ResponseEntity<Veiculo> (HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Veiculo> salvarVeiculo(@RequestBody  Veiculo veiculo) {
		return new ResponseEntity<Veiculo> (veiculoService.salvarVeiculo(veiculo), HttpStatus.OK);
	}
}
