package com.franzoo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.franzoo.entities.ChatEntity;

@Repository
public interface ChatRepository extends JpaRepository<ChatEntity, Long> {

	

	@Query("SELECT c from ChatEntity c ")
	List<ChatEntity> receiveAllMessages();
	
	
}
