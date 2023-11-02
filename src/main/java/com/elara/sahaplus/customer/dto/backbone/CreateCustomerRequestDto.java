package com.elara.sahaplus.customer.dto.backbone;

import com.elara.sahaplus.enums.CustomerType;
import com.elara.sahaplus.enums.Gender;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateCustomerRequestDto {
    @NotNull
    @JsonProperty("FirstName")
    private String firstName;
    @NotNull
    @JsonProperty("Gender")
    private Gender gender;
    @NotNull
    @JsonProperty("Email")
    private String email;
    @NotNull
    @JsonProperty("DateOfBirth")
    private LocalDateTime dateOfBirth;
    @NotNull
    @JsonProperty("BankVerificationNumber")
    private String bankVerificationNumber;
    @NotNull
    @JsonProperty("AccountOfficerCode")
    private String accountOfficerCode;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("OtherNames")
    private String otherNames;
    @JsonProperty("City")
    private String city;
    @JsonProperty("Address")
    private String address;
    @JsonProperty("PhoneNo")
    private String phoneNo;
    @JsonProperty("PlaceOfBirth")
    private String placeOfBirth;
    @JsonProperty("NationalIdentityNo")
    private String nationalIdentityNo;
    @JsonProperty("Email")
    private String nextOfKinName;
    @JsonProperty("NextOfKinPhoneNumber")
    private String nextOfKinPhoneNumber;
    @JsonProperty("ReferralName")
    private String referralName;
    @JsonProperty("ReferralPhoneNo")
    private String referralPhoneNo;
    @JsonProperty("CustomerType")
    private CustomerType customerType;
    @JsonProperty("BranchID")
    private long branchID;
    @JsonProperty("HasCurrentRunningLoanAndNotDefaulting")
    private boolean hasCurrentRunningLoanAndNotDefaulting;
    @JsonProperty("HasDefaultedInAnyLoan")
    private boolean hasDefaultedInAnyLoan;
    @JsonProperty("HasNoOutstandingLoanAndNotDefaulting")
    private boolean hasNoOutstandingLoanAndNotDefaulting;
    @JsonProperty("HasCompleteDocumentation")
    private boolean hasCompleteDocumentation;
    @JsonProperty("CustomerPassportInBytes")
    private byte[] customerPassportInBytes;
}
