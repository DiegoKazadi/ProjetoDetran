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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import br.cti.lti.Service.MultaService;
import br.cti.lti.dto.MultaDTO;
import br.cti.lti.models.Multa;

/**
 * @author ctis
 *
 */
@RestController
@RequestMapping("multas")
public class MultaController {

	@Autowired
	private MultaService multaService;

	@GetMapping("{id}")
	public ResponseEntity<MultaDTO> buscarMultaPorId(@PathVariable Long id) {
		return new ResponseEntity<MultaDTO>(multaService.buscarMultaPorId(id), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Multa>> listarMulta() {
		return new ResponseEntity<List<Multa>>(multaService.listarMulta(), HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<Multa> deletarMultaPorId(@PathVariable Long id) {
		multaService.deletarMultaPorId(id);
		return new ResponseEntity<Multa>(HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Multa> atualizarMultaPorId(@RequestBody Multa multa) {
		multaService.atualizarMulta(multa);
		return new ResponseEntity<Multa>(HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Multa> salvarMulta(@RequestBody Multa multa) {
		multaService.salvarMulta(multa);
		return new ResponseEntity<Multa>(HttpStatus.OK);
	}

}
