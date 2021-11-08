package com.franzoo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("Select u from User u WHERE u.mob=?1 and u.password=?2")
	User findByMob(String mob,String password);
	
	@Query("Select u from User u WHERE u.OTP=?1")
	User findByOtp(String OTP);
	
	@Transactional
	@Modifying
	@Query("Update User u set u.OTP=?1 WHERE u.email=?2")
	void updateOtp(String OTP,String email);
	
	@Query("Select u from User u WHERE is_Private = '0'")
	List<User> findByPrivate();
	
	@Transactional
	@Modifying
	@Query("Update User u set u.password=?1 WHERE u.email=?2")
	void chnagePassword(String password,String email);

	@Query("SELECT u FROM User u WHERE u.name like %?1% AND u.is_Private <> '1'")
	List<User> searchName(String name);

	@Query("SELECT u FROM User u WHERE u.email = ?1")
	User fetchUserbyEmail(String email);

	@Transactional
	@Modifying
	@Query("UPDATE User u SET u.password=?1 WHERE u.email=?2")
	int changePassword(String password,String email);

	@Query("SELECT u FROM User u WHERE u.uid=?1")
	User fetchUserById(long id);

	
}
