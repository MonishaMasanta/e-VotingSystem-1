package com.voting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voting.entity.ElectionEntity;


public interface ElectionRepository  extends JpaRepository<ElectionEntity, Integer> {

	
}
