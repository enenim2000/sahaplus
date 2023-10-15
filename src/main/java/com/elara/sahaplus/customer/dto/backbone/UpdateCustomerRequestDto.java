package com.elara.sahaplus.customer.dto.backbone;

import com.elara.sahaplus.enums.Gender;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerRequestDto {

    @JsonProperty("Id")
    @NotNull
    private long id;

    @NotNull
    private String customerID;

    @JsonProperty("Gender")
    private Gender gender;

    @JsonProperty("BankVerificationNumber")
    private String bankVerificationNumber;

    @JsonProperty("DateOfBirth")
    private Date dateOfBirth;

    @JsonProperty("LastName")
    private String lastName;

    @JsonProperty("OtherNames")
    private String otherNames;

    @JsonProperty("Address")
    private String address;

    @JsonProperty("Email")
    @Email
    private String email;

    @JsonProperty("Landmark")
    private String landmark;

    @JsonProperty("PhoneNumber")
    private String phoneNumber;

    @JsonProperty("NickName")
    private String nickName;

    @JsonProperty("EmailNotification")
    private boolean emailNotification;

    @JsonProperty("PhoneNotification")
    private boolean phoneNotification;

    @JsonProperty("DistrictOfResidence")
    private String districtOfResidence;

    @JsonProperty("DistrictOfBusiness")
    private String districtOfBusiness;

    @JsonProperty("IdentificationNumber")
    private String identificationNumber;

    @JsonProperty("HomeTown")
    private String homeTown;

    @JsonProperty("LocalGovernment")
    private String localGovernment;

    @JsonProperty("MothersMaidenName")
    private String mothersMaidenName;

    @JsonProperty("Nationale")
    private String nationale;

    @JsonProperty("TestQuestion")
    private String testQuestion;

    @JsonProperty("TestAnswer")
    private String testAnswer;

    @JsonProperty("State")
    private String state;

    @JsonProperty("WorkAddress")
    private String workAddress;

    @JsonProperty("WorkAnnualIncome")
    private long workAnnualIncome;

    @JsonProperty("WorkEmployerName")
    private String workEmployerName;

    @JsonProperty("WorkNextOfKin")
    private String workNextOfKin;

    @JsonProperty("WorkNextOfKinAddress")
    private String workNextOfKinAddress;

    @JsonProperty("WorkNextOfKinPhoneNo")
    private String workNextOfKinPhoneNo;

    @JsonProperty("WorkNextOfKinRelationship")
    private String workNextOfKinRelationship;

    @JsonProperty("WorkOccupation")
    private String workOccupation;

    @JsonProperty("WorkPhoneNo")
    private String workPhoneNo;

    @JsonProperty("NameOnUtilityBill")
    private String nameOnUtilityBill;

    @JsonProperty("AddressOnUtilityBill")
    private String addressOnUtilityBill;

    @JsonProperty("DateOnUtilityBill")
    private Date dateOnUtilityBill;

    @JsonProperty("CommentsForUtilityBill")
    private String commentsForUtilityBill;

    @JsonProperty("IsUtilityBillInfoComplete")
    private boolean isUtilityBillInfoComplete;

    @JsonProperty("NextOfKinEmailAddress")
    private String nextOfKinEmailAddress;

    @JsonProperty("CustomerPhoto")
    private String customerPhoto;

    @JsonProperty("CustomerSignature")
    private String customerSignature;

    @JsonProperty("Version")
    private String version;
}
