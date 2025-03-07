package com.MDS.Whatsapp_clone.infrastructure.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMessageBinaryContent extends JpaRepository<MessageContentBinaryEntity, Long> {
}