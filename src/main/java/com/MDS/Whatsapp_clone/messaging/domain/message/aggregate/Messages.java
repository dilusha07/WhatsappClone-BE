package com.MDS.Whatsapp_clone.messaging.domain.message.aggregate;

import com.MDS.Whatsapp_clone.shared.error.domain.Assert;

import java.util.List;

public record Messages(List<Messages> messages) {
    public Messages {
        Assert.field("messages", messages).notNull().noNullElement();
    }
}
