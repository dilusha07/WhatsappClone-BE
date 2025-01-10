package com.MDS.Whatsapp_clone.infrastructure.secondary.message;

import java.util.List;

public record ConversationIdWithUsers(ConversationPublicId conversationPublicId,
                                      List<UserPublicId> users) {
}

