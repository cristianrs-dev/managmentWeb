
package com.pi.manag.repository;

import com.pi.manag.entitie.Morador;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface MoradorRepository extends JpaRepository<Morador, Integer>{
    @EntityGraph(attributePaths = {"apartamento", "condominio", "secretaria", "veiculo", "visita"})
    @Query("SELECT m FROM Morador m WHERE m.id = :id")
    Morador findMoradorWithRelationships(@Param("id") Integer id);
}
