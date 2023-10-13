package com.elara.sahaplus.customer.dto.response;

import com.elara.sahaplus.enums.CustomerType;
import com.elara.sahaplus.enums.Gender;
import com.elara.sahaplus.util.BaseResponse;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CreateCustomerResponse extends BaseResponse {
    private Data data;

    public CreateCustomerResponse() {
        super();
    }

    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Data {
        private String firstName;
        private String lastName;
        private String otherNames;
        private String city;
        private String address;
        private Gender gender;
        private LocalDateTime dateOfBirth;
        private String phoneNo;
        private String placeOfBirth;
        private String nationalIdentityNo;
        private String nextOfKinName;
        private String nextOfKinPhoneNumber;
        private String referralName;
        private String referralPhoneNo;
        private CustomerType customerType;
        private long branchID;
        private String bankVerificationNumber;
        private String email;
        private boolean hasCurrentRunningLoanAndNotDefaulting;
        private boolean hasDefaultedInAnyLoan;
        private boolean hasNoOutstandingLoanAndNotDefaulting;
        private boolean hasCompleteDocumentation;
        private byte[] customerPassportInBytes;
        private String accountOfficerCode;

    }
}
