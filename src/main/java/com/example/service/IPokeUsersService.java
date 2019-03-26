package com.example.service;

import com.example.entity.PokeUsers;

public interface IPokeUsersService {
	
	public PokeUsers getCurrentUser (String name);
	public PokeUsers setLastPosition (int uid, int x, int y, int z, String place);
}
