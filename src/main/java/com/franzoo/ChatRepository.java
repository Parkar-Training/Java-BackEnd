package com.franzoo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.franzoo.entity.ChatEntity;

public interface ChatRepository extends JpaRepository<ChatEntity, Long> {

	

	@Query("SELECT c from ChatEntity c ")
	List<ChatEntity> receiveAllMessages();
	
	
}
