package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.PalletTown;

public interface PalletTownRepo extends JpaRepository<PalletTown, Integer>{
	
}
