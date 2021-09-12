package gov.tmo.tmokps.service.concrete;

import gov.tmo.tmokps.core.Utilities.Results.*;
import gov.tmo.tmokps.entities.concrete.Person;
import gov.tmo.tmokps.entities.concrete.PersonAddress;
import gov.tmo.tmokps.repository.TmoKpsAddressRepository;
import gov.tmo.tmokps.service.abstarcts.PersonAddressMapper;
import gov.tmo.tmokps.service.abstarcts.TmoKpsAddressService;
import gov.tmo.tmokps.service.abstarcts.TmoKpsService;
import gov.tmo.tmokps.service.constants.Messages;

import javax.transaction.Transactional;
import java.util.Optional;

public class TmoKpsServiceAddressImpl implements TmoKpsAddressService {

    private final TmoKpsAddressRepository tmoKpsAddressRepository;
    private final PersonAddressMapper personAddressMapper;
    private final TmoKpsService tmoKpsService;

    public TmoKpsServiceAddressImpl(TmoKpsAddressRepository tmoKpsAddressRepository, PersonAddressMapper personAddressMapper, TmoKpsService tmoKpsService) {
        this.tmoKpsAddressRepository = tmoKpsAddressRepository;
        this.personAddressMapper = personAddressMapper;
        this.tmoKpsService = tmoKpsService;
    }

    @Override
    public DataResult<PersonAddress> getByPersonId(Long personId) {

        Optional<PersonAddress> personAddressIs = tmoKpsAddressRepository.findById(personId);
        if(personAddressIs.isPresent()){
            return new SuccessDataResult<>(personAddressIs.get(), Messages.personGatedById);
        }
        else{
            return new ErrorDataResult<>(Messages.personGatedByIdError);
        }
    }

    @Override
    @Transactional
    public DataResult<PersonAddress> getByPersonTcNo(String TcNo) {
        DataResult<Person> personTc = tmoKpsService.getByTcNo(TcNo);
        if(!personTc.isSuccess()){
            return new ErrorDataResult<>(null,Messages.getPersonGatedByTcNoError);
        }

        Optional<PersonAddress> personAddressIs = tmoKpsAddressRepository.findById(personTc.getData().getId());
        if(personAddressIs.isPresent()){
            return new SuccessDataResult<>(personAddressIs.get(), Messages.personGatedById);
        }
        else{
            return new ErrorDataResult<>(Messages.personGatedByIdError);
        }
    }

    @Override
    public Result save(PersonAddress personAddress) {
        tmoKpsAddressRepository.save(personAddress);
        return new Result(true,Messages.personSaved);
    }

    @Override
    public Result update(Long id, PersonAddress personAddress) {
        Optional<PersonAddress> personAddressIs = tmoKpsAddressRepository.findById(id);
        if(!personAddressIs.isPresent()){
            return new ErrorResult(Messages.personGatedByIdError);
        }

        PersonAddress personAddressDb = personAddressIs.get();

        personAddressDb.setResidenceAddress(personAddress.getResidenceAddress());
        tmoKpsAddressRepository.save(personAddressDb);

        return new SuccessResult(Messages.personUpdated);
    }
}
