package com.MDS.Whatsapp_clone.messaging.domain.user.vo;

import com.MDS.Whatsapp_clone.shared.error.domain.Assert;

public record AuthorityName(String name) {

    public AuthorityName {
        Assert.field("name", name).notNull();
    }
}
