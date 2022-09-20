package com.voting.service;

import java.util.List;
import java.util.Optional;

import com.voting.entity.ElectionEntity;
import com.voting.exception.ElectionNotFoundException;

public interface ElectionService {

	List<ElectionEntity> getAllElection();

	Optional<ElectionEntity> getElection(int id) throws ElectionNotFoundException;

	ElectionEntity updateElection(int id, ElectionEntity election) throws ElectionNotFoundException;

	ElectionEntity addElection(ElectionEntity election);

	Optional<ElectionEntity> deleteElection(int id) throws ElectionNotFoundException;


}
