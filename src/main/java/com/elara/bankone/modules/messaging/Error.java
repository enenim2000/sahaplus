package com.elara.bankone.modules.messaging;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Error {
    private int groupId;
    private String groupName;
    private String name;
    private String description;
}
