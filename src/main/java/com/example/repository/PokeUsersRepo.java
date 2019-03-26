package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.PokeUsers;

public interface PokeUsersRepo extends JpaRepository<PokeUsers, Integer>{
	
	@Query(value = "Select * from poke_users p where p.name=:name",nativeQuery = true)
	public PokeUsers getCurrentUser (@Param("name") String name);
	
	@Query(value = "UPDATE poke_users "
			+ "SET last_location_x=:x, last_location_y=:y, last_location_z=:z, last_location_map=:place "
			+ "WHERE uid=:uid;",nativeQuery = true)
	public PokeUsers setLastPosition (@Param("uid") int uid, 
			@Param("x") int x, 
			@Param("y") int y, 
			@Param("z") int z, 
			@Param("place") String place);

}
