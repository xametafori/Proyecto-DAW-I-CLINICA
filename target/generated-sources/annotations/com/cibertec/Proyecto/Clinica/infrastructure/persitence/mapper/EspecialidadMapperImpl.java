package com.cibertec.Proyecto.Clinica.infrastructure.persitence.mapper;

import com.cibertec.Proyecto.Clinica.domain.model.Especialidad;
import com.cibertec.Proyecto.Clinica.infrastructure.persitence.entity.EspecialidadEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-06T21:20:13-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class EspecialidadMapperImpl implements EspecialidadMapper {

    @Override
    public Especialidad toDomain(EspecialidadEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Especialidad especialidad = new Especialidad();

        especialidad.setId( entity.getId() );
        especialidad.setNombre( entity.getNombre() );
        especialidad.setDescripcion( entity.getDescripcion() );

        return especialidad;
    }

    @Override
    public EspecialidadEntity toEntity(Especialidad model) {
        if ( model == null ) {
            return null;
        }

        EspecialidadEntity especialidadEntity = new EspecialidadEntity();

        especialidadEntity.setId( model.getId() );

        return especialidadEntity;
    }
}
