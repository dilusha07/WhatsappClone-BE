package com.MDS.Whatsapp_clone.messaging.domain.user.vo;

import com.MDS.Whatsapp_clone.shared.error.domain.Assert;

public record UserFirstname(String value) {

    public UserFirstname {
        Assert.field(value, value).maxLength(255);
    }
}
