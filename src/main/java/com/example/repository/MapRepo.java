package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Map;

public interface MapRepo extends JpaRepository<Map, Integer>{
	
}
