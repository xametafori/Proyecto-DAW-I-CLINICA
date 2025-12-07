package com.cibertec.Proyecto.Clinica.infrastructure.persitence.mapper;

import com.cibertec.Proyecto.Clinica.domain.model.Paciente;
import com.cibertec.Proyecto.Clinica.infrastructure.persitence.entity.PacienteEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-06T23:06:58-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class PacienteMapperImpl implements PacienteMapper {

    @Override
    public Paciente toDomain(PacienteEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Paciente paciente = new Paciente();

        paciente.setId( entity.getId() );
        paciente.setNombres( entity.getNombres() );
        paciente.setApellidos( entity.getApellidos() );
        paciente.setFechaNacimiento( entity.getFechaNacimiento() );
        paciente.setDni( entity.getDni() );
        paciente.setDireccion( entity.getDireccion() );
        paciente.setTelefono( entity.getTelefono() );
        paciente.setEmail( entity.getEmail() );

        return paciente;
    }

    @Override
    public PacienteEntity toEntity(Paciente model) {
        if ( model == null ) {
            return null;
        }

        PacienteEntity pacienteEntity = new PacienteEntity();

        pacienteEntity.setId( model.getId() );
        pacienteEntity.setNombres( model.getNombres() );
        pacienteEntity.setApellidos( model.getApellidos() );
        pacienteEntity.setFechaNacimiento( model.getFechaNacimiento() );
        pacienteEntity.setDni( model.getDni() );
        pacienteEntity.setDireccion( model.getDireccion() );
        pacienteEntity.setTelefono( model.getTelefono() );
        pacienteEntity.setEmail( model.getEmail() );

        return pacienteEntity;
    }
}
