package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Map;
import com.example.entity.PokeUsers;
import com.example.service.IMapService;
import com.example.service.IPokeUsersService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class PokeUsersController {
	@Autowired
	private IPokeUsersService ips;
	private IMapService ims;
	
	public List<Map> detechLastLocation() {
		List<Map> maps = ims.getMaps();
		System.err.println(maps);
		return null;
	}

	@RequestMapping(value = "/get/{name}", method = RequestMethod.GET, produces = "application/json")
	public PokeUsers getCurrentUser(@PathVariable("name") String name) {
		System.err.println(ips.getCurrentUser(name).getLast_location_map());
		return ips.getCurrentUser(name);
	}
	
	@RequestMapping(value = "/go/east/{name}", method = RequestMethod.GET, produces = "application/json")
	public PokeUsers goEast(@PathVariable("name") String name) {		
		PokeUsers pu = ips.getCurrentUser(name);
//		detechLastLocation();
		ips.setLastPosition(pu.getUid(),
				pu.getLast_location_x(), 
				pu.getLast_location_y() + 1, 
				pu.getLast_location_z(), 
				pu.getLast_location_map());
		
		return ips.getCurrentUser(name);
	}
	
	@RequestMapping(value = "/go/west/{name}", method = RequestMethod.GET, produces = "application/json")
	public PokeUsers goWest(@PathVariable("name") String name) {
		PokeUsers pu = ips.getCurrentUser(name);
		System.err.println(pu.getLast_location_map());
		ips.setLastPosition(pu.getUid(),
				pu.getLast_location_x(), 
				pu.getLast_location_y() - 1, 
				pu.getLast_location_z(), 
				pu.getLast_location_map());
		
		return ips.getCurrentUser(name);
	}
	
	@RequestMapping(value = "/go/north/{name}", method = RequestMethod.GET, produces = "application/json")
	public PokeUsers goNorth(@PathVariable("name") String name) {
		PokeUsers pu = ips.getCurrentUser(name);
		
		ips.setLastPosition(pu.getUid(),
				pu.getLast_location_x() + 1, 
				pu.getLast_location_y(), 
				pu.getLast_location_z(), 
				pu.getLast_location_map());
		
		return ips.getCurrentUser(name);
	}
	
	@RequestMapping(value = "/go/south/{name}", method = RequestMethod.GET, produces = "application/json")
	public PokeUsers goSouth(@PathVariable("name") String name) {
		PokeUsers pu = ips.getCurrentUser(name);
		
		ips.setLastPosition(pu.getUid(),
				pu.getLast_location_x() - 1, 
				pu.getLast_location_y(), 
				pu.getLast_location_z(), 
				pu.getLast_location_map());
		
		return ips.getCurrentUser(name);
	}
}
