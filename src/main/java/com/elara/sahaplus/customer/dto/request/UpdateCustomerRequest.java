package com.elara.sahaplus.customer.dto.request;

import com.elara.sahaplus.enums.Gender;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerRequest {
        @NotNull
        private long Id;

        @NotNull
        private String customerID;

        private Gender gender;

        private String bankVerificationNumber;

        private Date dateOfBirth;

        private String lastName;

        private String otherNames;

        private String address;

        @Email
        private String email;

        private String landmark;

        private String phoneNumber;

        private String nickName;

        private boolean emailNotification;

        private boolean phoneNotification;

        private String districtOfResidence;

        private String districtOfBusiness;

        private String identificationNumber;

        private String homeTown;

        private String localGovernment;

        private String mothersMaidenName;

        private String nationale;

        private String testQuestion;

        private String testAnswer;

        private String state;

        private String workAddress;

        private long workAnnualIncome;

        private String workEmployerName;

        private String workNextOfKin;

        private String workNextOfKinAddress;

        private String workNextOfKinPhoneNo;

        private String workNextOfKinRelationship;

        private String workOccupation;

        private String workPhoneNo;

        private String nameOnUtilityBill;

        private String addressOnUtilityBill;

        private Date dateOnUtilityBill;

        private String commentsForUtilityBill;

        private boolean isUtilityBillInfoComplete;

        private String nextOfKinEmailAddress;

        private String customerPhoto;

        private String customerSignature;

        private String version;
    }

