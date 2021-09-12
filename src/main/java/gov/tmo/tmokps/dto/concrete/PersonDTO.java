package gov.tmo.tmokps.dto.concrete;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import gov.tmo.tmokps.dto.abstracts.IDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Person Data Transfer Object")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonDTO implements IDto {

    @ApiModelProperty(required = true,value = "Kişi ID")
    private Long id;

    @NotNull
    @ApiModelProperty(required = true,value = "TC Numarası")
    private String tcNo;

    @ApiModelProperty(required = true,value = "Ad")
    private String name;

    @ApiModelProperty(required = true,value = "Soyad")
    private String surname;

    @ApiModelProperty(required = true,value = "Cinsiyet")
    private String gender;

    @ApiModelProperty(required = true,value = "Anne Adı")
    private String motherName;

    @ApiModelProperty(required = true,value = "Baba Adı")
    private String fatherName;

    @ApiModelProperty(required = true,value = "Nüfusa Kayıtlı Olduğu İl")
    private String populationProvince;

    @ApiModelProperty(required = true,value = "Nüfusa Kayıtlı Olduğu İlçe")
    private String populationDistrict;

    @ApiModelProperty(required = true,value = "Nüfusa Kayıtlı Olduğu Köy/Mahalle")
    private String populationVillage;

    @ApiModelProperty(required = true,value = "Doğum Yeri")
    private String birthPlace;

    @ApiModelProperty(required = true,value = "Nüfusa Kayıtlı Olduğu İlçe")
    private String identitySerialNumber;

    @ApiModelProperty(required = true,value = "Kimlik Seri Numarası")
    private String populationSerialNumber;

    @ApiModelProperty(required = true,value = "Medeni Durum")
    private String maritalStatus;

    @ApiModelProperty(required = true,value = "Nüfus Seri Numarası")
    private String familySerialNumber;

    @ApiModelProperty(required = true,value = "Cilt No")
    private String skinNumber;

    @ApiModelProperty(required = true,value = "Mahalle")
    private String neighborhood ;

    @ApiModelProperty(required = true,value = "Doğum Tarihi")
    private Date birthDate;

    @ApiModelProperty(required = true,value = "Sorgu Tarihi")
    private Date queryDate;

}
