package com.cibertec.Proyecto.Clinica.infrastructure.persitence.mapper;

import com.cibertec.Proyecto.Clinica.domain.model.CitaMedica;
import com.cibertec.Proyecto.Clinica.infrastructure.persitence.entity.CitaMedicaEntity;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-06T21:20:13-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class CitaMedicaMapperImpl implements CitaMedicaMapper {

    @Autowired
    private PacienteMapper pacienteMapper;
    @Autowired
    private MedicoMapper medicoMapper;

    @Override
    public CitaMedica toDomain(CitaMedicaEntity entity) {
        if ( entity == null ) {
            return null;
        }

        CitaMedica citaMedica = new CitaMedica();

        citaMedica.setPaciente( pacienteMapper.toDomain( entity.getPaciente() ) );
        citaMedica.setMedico( medicoMapper.toDomain( entity.getMedico() ) );
        citaMedica.setId( entity.getId() );
        citaMedica.setFecha( entity.getFecha() );
        citaMedica.setHora( entity.getHora() );
        citaMedica.setMotivo( entity.getMotivo() );
        citaMedica.setEstado( entity.getEstado() );
        citaMedica.setFechaCreacion( entity.getFechaCreacion() );
        citaMedica.setUsuarioCreacion( entity.getUsuarioCreacion() );
        citaMedica.setFechaActualizacion( entity.getFechaActualizacion() );
        citaMedica.setUsuarioActualizacion( entity.getUsuarioActualizacion() );

        return citaMedica;
    }

    @Override
    public CitaMedicaEntity toEntity(CitaMedica model) {
        if ( model == null ) {
            return null;
        }

        CitaMedicaEntity citaMedicaEntity = new CitaMedicaEntity();

        citaMedicaEntity.setPaciente( pacienteMapper.toEntity( model.getPaciente() ) );
        citaMedicaEntity.setMedico( medicoMapper.toEntity( model.getMedico() ) );
        citaMedicaEntity.setId( model.getId() );
        citaMedicaEntity.setFecha( model.getFecha() );
        citaMedicaEntity.setHora( model.getHora() );
        citaMedicaEntity.setMotivo( model.getMotivo() );
        citaMedicaEntity.setEstado( model.getEstado() );
        citaMedicaEntity.setFechaCreacion( model.getFechaCreacion() );
        citaMedicaEntity.setUsuarioCreacion( model.getUsuarioCreacion() );
        citaMedicaEntity.setFechaActualizacion( model.getFechaActualizacion() );
        citaMedicaEntity.setUsuarioActualizacion( model.getUsuarioActualizacion() );

        return citaMedicaEntity;
    }
}
