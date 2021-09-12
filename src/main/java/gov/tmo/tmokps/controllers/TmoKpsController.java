package gov.tmo.tmokps.controllers;

import gov.tmo.tmokps.core.Utilities.Results.DataResult;
import gov.tmo.tmokps.dto.concrete.PersonDTO;
import gov.tmo.tmokps.entities.concrete.Person;
import gov.tmo.tmokps.service.abstarcts.TmoKpsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tmokps")
public class TmoKpsController {

    private final TmoKpsService tmoKpsService;

    public TmoKpsController(TmoKpsService tmoKpsService) {
        this.tmoKpsService = tmoKpsService;
    }

    @GetMapping("/get/{tcno}")
    public DataResult<PersonDTO> getByTc(@PathVariable String tcno){
        return tmoKpsService.getByTcNoKps(tcno);
    }

}
