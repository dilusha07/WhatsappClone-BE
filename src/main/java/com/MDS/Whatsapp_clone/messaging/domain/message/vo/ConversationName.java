package com.MDS.Whatsapp_clone.messaging.domain.message.vo;

import com.MDS.Whatsapp_clone.shared.error.domain.Assert;

public record ConversationName(String name) {

    public ConversationName {
        Assert.field("name", name).minLength(3).maxLength(255);
    }
}