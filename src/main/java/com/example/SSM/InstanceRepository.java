package com.example.SSM;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;





public interface InstanceRepository extends CrudRepository<Model,Integer> {
	
	@Query(value = "select * from instances i where i.team_name = :TeamName ", nativeQuery = true)
	public List<Model> getInstanceByTeamName(String TeamName);

}
