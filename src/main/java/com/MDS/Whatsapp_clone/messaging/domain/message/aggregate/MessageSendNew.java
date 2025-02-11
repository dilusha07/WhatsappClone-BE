package com.MDS.Whatsapp_clone.messaging.domain.message.aggregate;

import com.MDS.Whatsapp_clone.messaging.domain.message.vo.ConversationPublicId;
import com.MDS.Whatsapp_clone.messaging.domain.message.vo.MessageContent;
import org.jilt.Builder;

@Builder
public record MessageSendNew(MessageContent messageContent,
                             ConversationPublicId conversationPublicId) {
}

