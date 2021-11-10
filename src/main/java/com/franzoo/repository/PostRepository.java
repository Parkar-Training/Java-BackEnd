package com.franzoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franzoo.entities.Postdata;

@Repository
public interface PostRepository extends JpaRepository<Postdata, Long> {

}
