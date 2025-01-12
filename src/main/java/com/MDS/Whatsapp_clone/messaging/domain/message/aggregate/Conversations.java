package com.MDS.Whatsapp_clone.messaging.domain.message.aggregate;

import com.MDS.Whatsapp_clone.shared.error.domain.Assert;

import java.util.List;

public record Conversations(List<Conversation> conversations) {

    public Conversations {
        Assert.field("conversations", conversations).notNull().noNullElement();
    }
}
