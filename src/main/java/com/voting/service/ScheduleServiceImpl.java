package com.voting.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voting.entity.ScheduleEntity;
import com.voting.exception.ScheduleNotFoundException;
import com.voting.repository.ScheduleRepository;


@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	private ScheduleRepository scheduleRepo;
	
	@Override
	public List<ScheduleEntity> getAllSchedule() {
		return scheduleRepo.findAll();
	}

	@Override
	public Optional<ScheduleEntity> getSchedule(int id) throws ScheduleNotFoundException {
		try {
			Optional<ScheduleEntity> scheduleData = scheduleRepo.findById(id);
			if(!scheduleData.isEmpty()) {
				return scheduleRepo.findById(id);
			}
			else {
				throw new ScheduleNotFoundException("Schedule Data not found");
			}
		}
		catch(Exception e){
			throw new ScheduleNotFoundException("Schedule Data not found");
		}	
	}

	@Override
	public ScheduleEntity addSchedule(ScheduleEntity scheduleEntity) {
		// TODO Auto-generated method stub
		return scheduleRepo.save(scheduleEntity);
	}

	@Override
	public Optional<ScheduleEntity> deleteSchedule(int id) throws ScheduleNotFoundException {

		try {
			Optional<ScheduleEntity> scheduleData = scheduleRepo.findById(id);
			if(!scheduleData.isEmpty()) {
				scheduleRepo.deleteById(id);
				return scheduleData;
			}
			else {
				throw new ScheduleNotFoundException("Schedule Data not found");
			}
		}
		catch(Exception e){
			throw new ScheduleNotFoundException("Schedule Data not found");
		}
	}

	@Override
	public ScheduleEntity updateSchedule(int id, ScheduleEntity scheduleEntity) throws ScheduleNotFoundException {
		try {
			Optional<ScheduleEntity> scheduleData = scheduleRepo.findById(id);
			if(!scheduleData.isEmpty()) {
				scheduleEntity.setid(id);
				return scheduleRepo.save(scheduleEntity);
			}
			else {
				throw new ScheduleNotFoundException("Schedule Data not found");
			}
		}
		catch(Exception e){
			throw new ScheduleNotFoundException("Schedule Data not found");
		}	
	}


	}

	
	
	



