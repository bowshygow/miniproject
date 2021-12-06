package com.example.SSM;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstanceController {
	
	@Autowired
	InstanceService isobj;
	
	@GetMapping("/allInstances")
	public List<Model> allIstances(){
		return isobj.fetch();		
	}
	
	@GetMapping("/InstanceById/{id}")
	public Model InstanceById(@PathVariable("id") int id){
		return isobj.searchById(id);	
	}
	
	@PostMapping("/storeInstance")
	public Model storeInstance(@RequestBody Model obj) {
		return isobj.createOrUpdateInstance(obj);
	}

	
	@PutMapping("/storeInstance")
	public void updateInstance(@RequestBody Model obj) {
		isobj.createOrUpdateInstance(obj);
	}

	@PutMapping("/UpdateState/{id}")
	public Model updateState(@RequestBody Model obj,@PathVariable("id") int id) {
		return isobj.searchById(id);
	}
	
	@GetMapping("/InstanceByTeam/{TeamName}")
	public List<Model> fineInstanceOfTeam(@PathVariable("TeamName") String teamName){
		return isobj.findByTeamName(teamName);		
	}
	
}
