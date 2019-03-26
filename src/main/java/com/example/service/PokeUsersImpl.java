package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.PokeUsers;
import com.example.repository.PokeUsersRepo;

@Service
public class PokeUsersImpl implements IPokeUsersService {
	@Autowired
	private PokeUsersRepo pr;

	@Override
	public PokeUsers getCurrentUser(String name) {
		// TODO Auto-generated method stub
		return pr.getCurrentUser(name);
	}

	@Override
	@Transactional
	public PokeUsers setLastPosition(int uid, int x, int y, int z, String place) {
		// TODO Auto-generated method stub
		return pr.setLastPosition(uid, x, y, z, place);
	}

}
