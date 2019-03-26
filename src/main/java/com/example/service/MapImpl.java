package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Map;
import com.example.repository.MapRepo;

@Service
public class MapImpl implements IMapService {
	@Autowired
	private MapRepo mr;

	@Override
	public List<Map> getMaps() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}

}
