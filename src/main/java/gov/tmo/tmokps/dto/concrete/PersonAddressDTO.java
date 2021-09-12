package gov.tmo.tmokps.dto.concrete;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import gov.tmo.tmokps.dto.abstracts.IDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Person Address Data Transfer Object")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonAddressDTO implements IDto {

    @ApiModelProperty(required = true,value = "Kişi ID")
    private Long id;

    @ApiModelProperty(required = true,value = "Kişi Açık Adresi")
    private String residenceAddress;
}
