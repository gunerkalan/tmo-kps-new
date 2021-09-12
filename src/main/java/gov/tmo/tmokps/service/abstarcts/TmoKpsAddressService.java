package gov.tmo.tmokps.service.abstarcts;

import gov.tmo.tmokps.core.Utilities.Results.DataResult;
import gov.tmo.tmokps.core.Utilities.Results.Result;
import gov.tmo.tmokps.dto.concrete.PersonAddressDTO;
import gov.tmo.tmokps.dto.concrete.PersonDTO;
import gov.tmo.tmokps.entities.concrete.PersonAddress;

public interface TmoKpsAddressService {

    DataResult<PersonAddress> getByPersonId(Long personId); //Id ye göre kişi yerleşim bilgisini getir

    DataResult<PersonAddress> getByPersonTcNo(String TcNo); //Tc No'ya göre kişi yerleşim bilgisini getir

    Result save(PersonAddress personAddress); //Kişi yerleşim yeri bilgisini kaydet

    Result update(Long id, PersonAddress personAddress); //Kişi yerleşim yeri bilgisini güncelle
}
