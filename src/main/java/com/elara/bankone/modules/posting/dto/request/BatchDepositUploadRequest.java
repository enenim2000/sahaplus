package com.elara.bankone.modules.posting.dto.request;

import com.elara.bankone.modules.posting.BatchDepositUploadEntries;
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
