package gov.tmo.tmokps.repository;

import gov.tmo.tmokps.entities.concrete.PersonAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TmoKpsAddressRepository extends JpaRepository<PersonAddress,Long> {
}
