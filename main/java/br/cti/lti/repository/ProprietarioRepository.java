/**
 * 
 */
package br.cti.lti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.cti.lti.models.Proprietario;

/**
 * @author ctis
 *
 */
@Repository
public interface ProprietarioRepository extends JpaRepository <Proprietario, Long> {
	
	}
