package gov.tmo.tmokps.service.concrete;

import gov.tmo.tmokps.core.Utilities.Results.DataResult;
import gov.tmo.tmokps.entities.concrete.Person;
import gov.tmo.tmokps.service.abstarcts.KpsService;
import org.springframework.stereotype.Service;

@Service
public class KpsServiceImpl implements KpsService {
    @Override
    public DataResult<Person> getByTcNo(String TcNo) {
        return null;
    }
}
