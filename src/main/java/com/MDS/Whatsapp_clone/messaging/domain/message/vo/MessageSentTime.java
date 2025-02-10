package com.MDS.Whatsapp_clone.messaging.domain.message.vo;

import com.MDS.Whatsapp_clone.shared.error.domain.Assert;

import java.time.Instant;

public record MessageSentTime(Instant date) {
    public MessageSentTime {
        Assert.field("date", date).notNull();
    }
}
