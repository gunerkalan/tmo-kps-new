package gov.tmo.tmokps.service.abstarcts;

import gov.tmo.tmokps.dto.concrete.PersonDTO;
import gov.tmo.tmokps.entities.concrete.Person;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    Person dtoToEntity(PersonDTO personDTO);

    PersonDTO entityToDto(Person person);

    List<PersonDTO> entityListToDtoList(List<Person> personList);

    List<Person> dtoListToEntityList(List<PersonDTO> personDTOList);

}
