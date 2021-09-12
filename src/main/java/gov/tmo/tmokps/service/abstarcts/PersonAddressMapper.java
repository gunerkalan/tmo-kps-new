package gov.tmo.tmokps.service.abstarcts;

import gov.tmo.tmokps.dto.concrete.PersonAddressDTO;
import gov.tmo.tmokps.dto.concrete.PersonDTO;
import gov.tmo.tmokps.entities.concrete.Person;
import gov.tmo.tmokps.entities.concrete.PersonAddress;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonAddressMapper {

    PersonAddress dtoToEntity(PersonAddressDTO personAddressDTO);

    PersonAddressDTO entityToDto(PersonAddress personAddress);
}
