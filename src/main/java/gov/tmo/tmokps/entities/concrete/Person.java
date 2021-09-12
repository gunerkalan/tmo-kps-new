package gov.tmo.tmokps.entities.concrete;

import com.fasterxml.jackson.annotation.JsonFormat;
import gov.tmo.tmokps.entities.abstracts.IEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "person", indexes = {@Index(name="idx_Tc_No", columnList="tc_No")})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person extends BaseEntity implements IEntity {

    @Id
    @SequenceGenerator(name="seq_person",allocationSize = 1)
    @GeneratedValue(generator = "seq_person",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="tc_No",length = 11, nullable = false)
    private String tcNo;

    @Column(name="name",length = 50, nullable = false)
    private String name;

    @Column(name="surname",length = 100, nullable = false)
    private String surname;

    @Column(name="gender",length = 20, nullable = false)
    private String gender;

    @Column(name="mother_name",length = 50, nullable = false)
    private String motherName;

    @Column(name="father_name",length = 50, nullable = false)
    private String fatherName;

    @Column(name="population_province",length = 50, nullable = false)
    private String populationProvince;

    @Column(name="population_district",length = 50, nullable = false)
    private String populationDistrict;

    @Column(name="population_village",length = 50,nullable = false)
    private String populationVillage;

    @Column(name="birth_place",length = 100, nullable = false)
    private String birthPlace;

    @Column(name="identity_serial_number",length = 50)
    private String identitySerialNumber;

    @Column(name="population_serial_number",length = 50)
    private String populationSerialNumber;

    @Column(name="marital_status",length = 50, nullable = false)
    private String maritalStatus;

    @Column(name="family_serial_number",length = 50)
    private String familySerialNumber;

    @Column(name="skin_number",length = 50)
    private String skinNumber;

    @Column(name="neighborhood ",length = 100)
    private String neighborhood ;

    @Column(name ="birth_date",nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date birthDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private PersonAddress personAddress;

}
