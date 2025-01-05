package com.MDS.Whatsapp_clone.messaging.domain.user.vo;

import com.MDS.Whatsapp_clone.shared.error.domain.Assert;

public record UserImageUrl(String value) {

    public UserImageUrl {
        Assert.field(value, value).maxLength(255);
    }
}
