package com.elara.bankone.modules.customer.dto.request;

import com.elara.bankone.enums.CustomerType;
import com.elara.bankone.enums.Gender;
import lombok.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerRequest {

    @NotNull
    private String firstName;
    @NotNull
    private Gender gender;
    @Email
    @NotNull
    private String email;
    @NotNull
    private LocalDateTime dateOfBirth;
    @NotNull
    private String bankVerificationNumber;
    @NotNull
    private String accountOfficerCode;
    private String lastName;
    private String otherNames;
    private String city;
    private String address;
    private String phoneNo;
    private String placeOfBirth;
    private String nationalIdentityNo;
    private String nextOfKinName;
    private String nextOfKinPhoneNumber;
    private String referralName;
    private String referralPhoneNo;
    private CustomerType customerType;
    private long branchID;
    private boolean hasCurrentRunningLoanAndNotDefaulting;
    private boolean hasDefaultedInAnyLoan;
    private boolean hasNoOutstandingLoanAndNotDefaulting;
    private boolean hasCompleteDocumentation;
    private byte[] customerPassportInBytes;
}
