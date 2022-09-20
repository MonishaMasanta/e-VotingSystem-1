package com.voting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voting.entity.ScheduleEntity;


public interface ScheduleRepository  extends JpaRepository<ScheduleEntity, Integer> {

	
}

