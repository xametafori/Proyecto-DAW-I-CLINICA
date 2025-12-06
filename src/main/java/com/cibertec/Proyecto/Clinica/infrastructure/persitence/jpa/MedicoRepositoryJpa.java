package com.cibertec.Proyecto.Clinica.infrastructure.persitence.jpa;
import com.cibertec.Proyecto.Clinica.infrastructure.persitence.entity.MedicoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicoRepositoryJpa extends JpaRepository<MedicoEntity, Integer> {

    @Query("SELECT m FROM MedicoEntity m JOIN FETCH m.especialidad e")
    Page<MedicoEntity> findAllMedicosConEspecialidad(Pageable pageable);
    @Query("SELECT m FROM MedicoEntity m JOIN FETCH m.especialidad e WHERE e.id = :especialidadId")
    List<MedicoEntity> findByEspecialidadId(@Param("especialidadId") Integer especialidadId);

}
