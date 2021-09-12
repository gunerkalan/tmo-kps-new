package gov.tmo.tmokps.service.abstarcts;

import gov.tmo.tmokps.core.Utilities.Results.DataResult;
import gov.tmo.tmokps.core.Utilities.Results.Result;
import gov.tmo.tmokps.dto.concrete.PersonDTO;
import gov.tmo.tmokps.entities.concrete.Person;

import java.util.List;

public interface TmoKpsService {

     DataResult<Person> getByTcNo(String TcNo);

     DataResult<PersonDTO> getByTcNoKps(String TcNo);

}
