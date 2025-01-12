package com.MDS.Whatsapp_clone.infrastructure.secondary.message;

import java.util.List;
import java.util.UUID;

public record ConversationViewedForNotification(UUID conversationId,
                                                List<UUID> messageIdsViewed) {
}
