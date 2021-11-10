package com.franzoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franzoo.entities.Advertise;

@Repository
public interface AdvertiseRepository extends JpaRepository<Advertise, Long> {
	

}
