package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.PalletTown;
import com.example.repository.PalletTownRepo;

@Service
public class PalletTownServiceImpl implements IPalletTownService {
	@Autowired
	private PalletTownRepo ptr;

	@Override
	public List<PalletTown> getListPalletTown() {
		return ptr.findAll();
	}
}
