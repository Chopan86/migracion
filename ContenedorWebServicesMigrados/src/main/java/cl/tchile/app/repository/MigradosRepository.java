package cl.tchile.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.tchile.app.entity.MigradosEntity;

/**
 * The Interface MigradosRepository.
 */
@Repository
public interface MigradosRepository extends JpaRepository<MigradosEntity, String> {

	/**
	 * Select byi D.
	 *
	 * @param id the id
	 * @return the migrados entity
	 */
	@Query(value = "SELECT * FROM MIGRADOS WHERE LINEA = :linea", nativeQuery = true)
	MigradosEntity SelectByLinea(@Param("linea") String linea);
}
