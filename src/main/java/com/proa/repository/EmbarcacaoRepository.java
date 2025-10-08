package com.proa.repository;

<<<<<<< HEAD
import java.time.LocalDate;
=======
>>>>>>> f58abc8ad168d6a349f49f73878ceaaa4d2cbc3a
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.proa.model.Cliente;
=======
import org.springframework.stereotype.Repository;

>>>>>>> f58abc8ad168d6a349f49f73878ceaaa4d2cbc3a
import com.proa.model.Embarcacao;

@Repository
public interface EmbarcacaoRepository extends JpaRepository<Embarcacao, Long> {
	
	List<Embarcacao> findByClienteId(Long id);
	
<<<<<<< HEAD
	@Query(value = "SELECT * FROM embarcacao c WHERE " +
            "c.dtinscricao IS NOT NULL AND " +
            "c.dtinscricao + INTERVAL '5 years' BETWEEN ?1 AND ?2", 
            nativeQuery = true)
     List<Embarcacao> findEmbarcacaoComTieVencendoEntre(
         @Param("dataInicio") LocalDate dataInicio, 
         @Param("dataFim") LocalDate dataFim
     );
	
	
	@Query(value = "SELECT * FROM embarcacao c WHERE " +
            "c.dtseguro IS NOT NULL AND " +
            "c.dtseguro + INTERVAL '1 years' BETWEEN ?1 AND ?2", 
            nativeQuery = true)
     List<Embarcacao> findEmbarcacaoComSeguroVencendoEntre(
         @Param("dataInicio") LocalDate dataInicio, 
         @Param("dataFim") LocalDate dataFim
     );
=======
>>>>>>> f58abc8ad168d6a349f49f73878ceaaa4d2cbc3a

}
