package gov.tmo.tmokps.service.concrete;

import gov.tmo.tmokps.core.Utilities.Results.DataResult;
import gov.tmo.tmokps.entities.concrete.Person;
import gov.tmo.tmokps.service.abstarcts.KpsService;
import gov.tmo.tmokps.soap.api.kps.*;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;
import java.util.List;

@Service
public class KpsServiceImpl implements KpsService {
    @Override
    public DataResult<Person> getByTcNo(Long TcNo) {


        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<Long> jaxbElement = objectFactory.createLong(TcNo);

        //Sorgu Kriteri oluşturuldu.
        Sorgula sorgula = new Sorgula();
        sorgula.;




        return null;
    }
}
