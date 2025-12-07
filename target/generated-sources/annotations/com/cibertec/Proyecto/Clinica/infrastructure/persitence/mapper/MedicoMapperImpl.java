package com.cibertec.Proyecto.Clinica.infrastructure.persitence.mapper;

import com.cibertec.Proyecto.Clinica.domain.model.Medico;
import com.cibertec.Proyecto.Clinica.infrastructure.persitence.entity.MedicoEntity;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-06T21:20:13-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class MedicoMapperImpl implements MedicoMapper {

    @Autowired
    private EspecialidadMapper especialidadMapper;

    @Override
    public Medico toDomain(MedicoEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Medico medico = new Medico();

        medico.setId( entity.getId() );
        medico.setNombres( entity.getNombres() );
        medico.setApellidos( entity.getApellidos() );
        medico.setCmp( entity.getCmp() );
        medico.setEspecialidad( especialidadMapper.toDomain( entity.getEspecialidad() ) );
        medico.setFechaCreacion( entity.getFechaCreacion() );
        medico.setUsuarioCreacion( entity.getUsuarioCreacion() );
        medico.setFechaActualizacion( entity.getFechaActualizacion() );
        medico.setUsuarioActualizacion( entity.getUsuarioActualizacion() );

        return medico;
    }

    @Override
    public MedicoEntity toEntity(Medico model) {
        if ( model == null ) {
            return null;
        }

        MedicoEntity medicoEntity = new MedicoEntity();

        medicoEntity.setId( model.getId() );
        medicoEntity.setNombres( model.getNombres() );
        medicoEntity.setApellidos( model.getApellidos() );
        medicoEntity.setCmp( model.getCmp() );
        medicoEntity.setEspecialidad( especialidadMapper.toEntity( model.getEspecialidad() ) );
        medicoEntity.setFechaCreacion( model.getFechaCreacion() );
        medicoEntity.setUsuarioCreacion( model.getUsuarioCreacion() );
        medicoEntity.setFechaActualizacion( model.getFechaActualizacion() );
        medicoEntity.setUsuarioActualizacion( model.getUsuarioActualizacion() );

        return medicoEntity;
    }
}
