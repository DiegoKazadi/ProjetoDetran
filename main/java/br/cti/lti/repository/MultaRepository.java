/**
 * 
 */
package br.cti.lti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.cti.lti.models.Multa;

/**
 * @author ctis
 *
 */
@Repository
public interface MultaRepository extends JpaRepository<Multa, Long> {

}
