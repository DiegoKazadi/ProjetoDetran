/**
 * 
 */
package br.cti.lti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.cti.lti.models.Veiculo;

/**
 * @author ctis
 *
 */
@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

}
