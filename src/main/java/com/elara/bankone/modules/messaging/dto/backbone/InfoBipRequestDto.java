package com.elara.bankone.modules.messaging.dto.backbone;

import com.elara.bankone.modules.messaging.Error;
import com.elara.bankone.modules.messaging.Price;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InfoBipRequestDto {
    private String messageId;
    private String to;
    private String sentAt;
    private String doneAt;
    private int smsCount;
    private String bulkId;
    private Price price;
    private Object status;
    private Error error;
}
