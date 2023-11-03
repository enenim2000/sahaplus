package com.elara.bankone.modules.mis_report_system;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Mfbs {
    private String address;
    private boolean allowPostPaidBilling;
    private String CBNCode;
    private String code;
    private int commercialBank;
    private String contactEmail;
    private String contactFirstName;
    private String contactLastName;
    private String contactPhone;
    private String CRMAccountID;
    private boolean disallowPostPaidBilling;
    private boolean doSystemAccessCheck;
    private String email;
    private boolean enableAccountOfficer2FA;
    private String footer;
    private long ID;
    private String identityCode;
    private String imageUrl;
    private int institutionCode;
    private int institutionType;
    private String localConnectionString;
    private long maxCards;
    private long maxUsers;
    private String name;
    private long paymentServicesBankID;
    private String phone;
    private String remoteConnectionString;
    private String shortName;
    private String SMSAcctPassword;
    private String SMSAcctUsername;
    private int state;
    private long stateID;
    private long status;
    private int countryID;
}


