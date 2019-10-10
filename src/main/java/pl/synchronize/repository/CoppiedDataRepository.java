package pl.synchronize.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import pl.synchronize.model.CoppiedData;

public interface CoppiedDataRepository extends CrudRepository<CoppiedData, Long>{
	
	@Query(value = "SELECT alan.data.id, alan.data.data FROM alan.data LEFT JOIN alan.coppied_data ON alan.data.id = alan.coppied_data.id WHERE coppied_data.data IS NULL", 
			  nativeQuery = true)
	List<CoppiedData> findAdded();
	
	@Query(value = "SELECT alan.coppied_data.id, alan.coppied_data.data FROM alan.coppied_data LEFT JOIN alan.data ON alan.coppied_data.id = alan.data.id WHERE data.data IS NULL", 
			  nativeQuery = true)
	List<CoppiedData> findDeleted();
}
