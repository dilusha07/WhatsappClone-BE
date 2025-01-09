package com.MDS.Whatsapp_clone.messaging.domain.user.aggregate;

import com.MDS.Whatsapp_clone.messaging.domain.user.vo.AuthorityName;
import com.MDS.Whatsapp_clone.shared.error.domain.Assert;
import org.jilt.Builder;

@Builder
public class Authority {

    private AuthorityName name;

    public Authority(AuthorityName name) {
        Assert.notNull("name", name);
        this.name = name;
    }

    public AuthorityName getName() {
        return name;
    }
}