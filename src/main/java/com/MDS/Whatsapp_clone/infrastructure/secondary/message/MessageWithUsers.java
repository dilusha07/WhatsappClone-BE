package com.MDS.Whatsapp_clone.infrastructure.secondary.message;

import java.util.List;

public record MessageWithUsers(Message message, List<UserPublicId> userToNotify) {
}
