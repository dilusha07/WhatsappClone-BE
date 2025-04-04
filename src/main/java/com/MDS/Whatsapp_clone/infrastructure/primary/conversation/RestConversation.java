package com.MDS.Whatsapp_clone.infrastructure.primary.conversation;

import com.MDS.Whatsapp_clone.infrastructure.primary.message.RestMessage;
import com.MDS.Whatsapp_clone.messaging.domain.message.aggregate.Conversation;
import org.jilt.Builder;

import java.util.List;
import java.util.UUID;

@Builder
public record RestConversation(UUID publicId, String name,
                               List<RestUserForConversation> members,
                               List<RestMessage> messages) {

    public static RestConversation from(Conversation conversation) {
        RestConversationBuilder restConversationBuilder = RestConversationBuilder.restConversation()
                .name(conversation.getConversationName().name())
                .publicId(conversation.getConversationPublicId().value())
                .members(RestUserForConversation.from(conversation.getMembers()));

        if (conversation.getMessages() != null) {
            restConversationBuilder.messages(RestMessage.from(conversation.getMessages()));
        }

        return restConversationBuilder.build();
    }

}