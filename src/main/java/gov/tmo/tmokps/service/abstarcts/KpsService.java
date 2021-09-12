package gov.tmo.tmokps.service.abstarcts;

import gov.tmo.tmokps.core.Utilities.Results.DataResult;
import gov.tmo.tmokps.entities.concrete.Person;

public interface KpsService {

    DataResult<Person> getByTcNo(Long TcNo);

   //Kimlik Numarası İle Bileşik Kütük Sorgulama Servisi

   //Kimlik Numarası İle Yerleşim Yeri Bilgisi Sorgulama Servisi
}
