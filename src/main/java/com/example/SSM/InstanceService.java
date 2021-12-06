package com.example.SSM;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstanceService {
	
	@Autowired
	private InstanceRepository irobj;
	
	public Model createOrUpdateInstance(Model obj) {
		return irobj.save(obj);
	}
	
	public void deleteInstanceById(int id) {
		irobj.deleteById(id);
	}
	
	public List<Model> fetch() {
		List<Model> lst = new ArrayList<Model>();  
		irobj.findAll().forEach(x -> lst.add(x));  
		return lst;  
	}
	
	public Model searchById(int id) {
		return irobj.findById(id).get();
	}
	
	public List<Model> findByTeamName(String teamName) {
		List<Model> lst = new ArrayList<Model>();  
		irobj.getInstanceByTeamName(teamName).forEach(x -> lst.add(x));  
		return lst;
	}
		

}
