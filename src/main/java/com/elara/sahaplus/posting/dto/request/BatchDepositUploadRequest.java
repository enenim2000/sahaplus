package com.elara.sahaplus.posting.dto.request;

import com.elara.sahaplus.posting.BatchDepositUploadEntries;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BatchDepositUploadRequest {
    @NotNull
    private String accountOfficerCode;
    private boolean checkPostWithEmployeeCode;
    private BatchDepositUploadEntries batchDepositUploadEntries;
}
