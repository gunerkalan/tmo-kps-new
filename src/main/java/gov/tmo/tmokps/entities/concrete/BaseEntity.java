package gov.tmo.tmokps.entities.concrete;

import com.fasterxml.jackson.annotation.JsonFormat;
import gov.tmo.tmokps.entities.abstracts.IEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
public class BaseEntity implements IEntity {

    @Column(name ="query_date",nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date queryDate;

}
