package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.PalletTown;
import com.example.service.IPalletTownService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PalletTownController {
	@Autowired
	private IPalletTownService ipts;

	@RequestMapping(value = "/Pallet-Town", method = RequestMethod.GET, produces = "application/json")
	public List<PalletTown> getListLectures() {
		return ipts.getListPalletTown();
	}
}
