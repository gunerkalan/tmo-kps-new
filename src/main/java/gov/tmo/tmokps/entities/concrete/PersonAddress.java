package gov.tmo.tmokps.entities.concrete;

import gov.tmo.tmokps.entities.abstracts.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "personAddress")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonAddress extends BaseEntity implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne(mappedBy = "personAddress")
    private Person person;

    @Column(name = "residence_address", columnDefinition = "TEXT", length = 4000)
    private String residenceAddress;

}
