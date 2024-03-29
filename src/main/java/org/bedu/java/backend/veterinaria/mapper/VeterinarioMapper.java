package org.bedu.java.backend.veterinaria.mapper;

import org.bedu.java.backend.veterinaria.dto.CreateVeterinariioDTO;
import org.bedu.java.backend.veterinaria.dto.UpdateVeterinarioDTO;
import org.bedu.java.backend.veterinaria.dto.VeterinarioDTO;
import org.bedu.java.backend.veterinaria.model.Veterinario;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)

public interface VeterinarioMapper {

    VeterinarioDTO toDTO (Veterinario model);

    List<VeterinarioDTO>toDTO(List<Veterinario>model);

    @Mapping(target = "id", ignore = true)
    Veterinario toModel(CreateVeterinariioDTO dto);


    // En vez de transformar un UpdateArtistDTO a Artist
    // actualiza la referencia de Artist con lo que haya en UpdateArtistDTO
    @Mapping(target = "id", ignore = true)
    void update(@MappingTarget Veterinario veterinario, UpdateVeterinarioDTO data);



}
