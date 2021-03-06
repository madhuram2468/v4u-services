package com.mobifever.we4u.dao;

import java.util.List;

import com.mobifever.we4u.dto.DisasterDTO;
import com.mobifever.we4u.exception.We4UException;
import com.mobifever.we4u.model.Disaster;

public interface DisasterDAO {

	public String add(Disaster disaster) throws We4UException;

	public Integer getDisasterId() throws We4UException;

	public Disaster getDisasterDetails(int disasterId) throws We4UException;

	public List<Disaster> getDisasters() throws We4UException;

	public List<Disaster> getDisastersRequired(long id, String location,
			String disasterType) throws We4UException;

	public Disaster checkIfDisasterExists(DisasterDTO disasterDto) throws We4UException;

	public void addMemberToDisaster(Integer userId, int disasterId) throws We4UException;

	public void update(Disaster disasterDto) throws We4UException;
	
}
