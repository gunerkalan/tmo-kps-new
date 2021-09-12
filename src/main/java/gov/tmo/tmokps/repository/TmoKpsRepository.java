package gov.tmo.tmokps.repository;

import gov.tmo.tmokps.entities.concrete.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;


public interface TmoKpsRepository extends JpaRepository<Person,Long> {

    @Query("select p from Person p where p.tcNo = ?1")
    Optional<Person> findByTcNoEquals(String tcNo);

    @Query("select p from Person p where upper(p.name) like upper(?1) and upper(p.surname) like upper(?2)")
    List<Person> findByNameAndSurnameLike(String name, String surname);



}
