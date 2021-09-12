package gov.tmo.tmokps.service.concrete;

import gov.tmo.tmokps.core.Utilities.Results.*;
import gov.tmo.tmokps.dto.concrete.PersonDTO;
import gov.tmo.tmokps.entities.concrete.Person;
import gov.tmo.tmokps.repository.TmoKpsRepository;
import gov.tmo.tmokps.service.abstarcts.KpsService;
import gov.tmo.tmokps.service.abstarcts.PersonMapper;
import gov.tmo.tmokps.service.abstarcts.TmoKpsService;
import gov.tmo.tmokps.service.constants.Messages;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

@Service
public class TmoKpsServiceImpl implements TmoKpsService {

    private final TmoKpsRepository tmoKpsRepository;
    private final PersonMapper personMapper;
    private final KpsService kpsService;

    public TmoKpsServiceImpl(TmoKpsRepository tmoKpsRepository, PersonMapper personMapper, KpsService kpsService) {
        this.tmoKpsRepository = tmoKpsRepository;
        this.personMapper = personMapper;
        this.kpsService = kpsService;
    }


    private DataResult<Person> getByPersonId(Long personId) {
        Optional<Person> personIs = tmoKpsRepository.findById(personId);
        if(personIs.isPresent()){
            return new SuccessDataResult<>(personIs.get(), Messages.personGatedById);
        }
        else{
            return new ErrorDataResult<>(Messages.personGatedByIdError);
        }

    }


    private Result save(Person person) {
        tmoKpsRepository.save(person);
        return new Result(true,Messages.personSaved);
    }


    @Transactional
    public Result update(Long id, Person person) {
        Optional<Person> personIs = tmoKpsRepository.findById(id);
        if(personIs.isEmpty()){
            return new ErrorResult(Messages.personGatedByIdError);
        }

        Person personDb = personIs.get();

        personDb.setName(person.getName());
        personDb.setSurname(person.getSurname());
        personDb.setGender(person.getGender());
        personDb.setMotherName(person.getMotherName());
        personDb.setFatherName(person.getFatherName());
        personDb.setPopulationProvince(person.getPopulationProvince());
        personDb.setPopulationDistrict(person.getPopulationDistrict());
        personDb.setPopulationVillage(person.getPopulationVillage());
        personDb.setBirthPlace(person.getBirthPlace());
        personDb.setIdentitySerialNumber(person.getIdentitySerialNumber());
        personDb.setPopulationSerialNumber(person.getPopulationSerialNumber());
        personDb.setMaritalStatus(person.getMaritalStatus());
        personDb.setFamilySerialNumber(person.getFamilySerialNumber());
        personDb.setSkinNumber(person.getSkinNumber());
        personDb.setNeighborhood(person.getNeighborhood());
        personDb.setBirthDate(person.getBirthDate());

        tmoKpsRepository.save(personDb);

        return new SuccessResult(Messages.personUpdated);
    }

    @Override
    public DataResult<Person> getByTcNo(String TcNo) {
        Optional<Person> personIs = tmoKpsRepository.findByTcNoEquals(TcNo);
        if(personIs.isPresent()){
            return new SuccessDataResult<>(personIs.get(), Messages.personGatedByTcNo);
        }
        else{
            return new ErrorDataResult<>(Messages.getPersonGatedByTcNoError);
        }
    }

    @Override
    public DataResult<PersonDTO> getByTcNoKps(String TcNo) {
        DataResult<Person> personResult = getByTcNo(TcNo);
        Date todayZone = new Date();
        int timeZone=0;
        if(personResult.isSuccess()){
           timeZone = 185; //İki gün arasındaki gün sayısını hesapla ;
            if(timeZone>180){

                //Kişi veritabında var ama 180 gün süresi dolmuş
                //Kps servisinden Tc No ile kişiyi çeken ve persona aktaran metodu çağır
                //Düzenle metodunu çağır
                //return et
            }
            else{
               return new SuccessDataResult<>(personMapper.entityToDto(personResult.getData()),Messages.personGatedByTcNo);
            }
        }
        else{

            //Kişi veritabanında yok
            //Kps servisinden Tc No ile kişiyi çeken ve persona aktaran metodu çağır
            //Kaydet metodunu çağır
            //return et

        }

        return null;
    }

    public static long getDifferenceDays(Date d1,Date d2) throws ParseException {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");

        int daysdiff = 0;
        Date date1 = myFormat.parse(String.valueOf(d1));
        Date date2 = myFormat.parse(String.valueOf(new Date()));
        long diff = date2.getTime() - date1.getTime();
        daysdiff = (int) diff;
        return daysdiff;

    }
}
