/**
 * 
 */
package br.cti.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.cti.lti.Service.ProprietarioService;
import br.cti.lti.dto.ProprietarioDTO;

/**
 * @author ctis
 *
 */
@RestController
@RequestMapping("/proprietario")
public class ProprietarioController {
	
	@Autowired
	private ProprietarioService proprietarioService;
	
	@GetMapping("{id}")
	public ResponseEntity<ProprietarioDTO> buscarProprietarioPorId(@PathVariable Long id){
		return new ResponseEntity<ProprietarioDTO>(proprietarioService.listarPorId(id), HttpStatus.OK);
	}
	
	@GetMapping("{nome}")
	public ResponseEntity<ProprietarioDTO> buscarPeloNome(@PathVariable String nome){
		return new ResponseEntity<ProprietarioDTO>(HttpStatus.OK);
	}
	
	@GetMapping("{cpf}")
	public ResponseEntity<ProprietarioDTO> buscarPeloCpf(@PathVariable String cpf){
		return new ResponseEntity<ProprietarioDTO>(HttpStatus.OK);
	}

}
