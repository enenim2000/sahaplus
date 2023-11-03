package com.elara.bankone.modules.messaging.dto.backbone;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveEmailResponseDto {
    private boolean isMessageSent;
}
