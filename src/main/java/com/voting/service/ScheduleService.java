package com.voting.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.voting.entity.ScheduleEntity;
import com.voting.exception.ScheduleNotFoundException;

public interface ScheduleService {

	List<ScheduleEntity> getAllSchedule();

	Optional<ScheduleEntity> getSchedule(int id) throws ScheduleNotFoundException;

	ScheduleEntity addSchedule(@Valid ScheduleEntity scheduleEntity);

	ScheduleEntity updateSchedule(int id, @Valid ScheduleEntity scheduleEntity) throws ScheduleNotFoundException;

	Optional<ScheduleEntity> deleteSchedule(int id) throws ScheduleNotFoundException;

}

