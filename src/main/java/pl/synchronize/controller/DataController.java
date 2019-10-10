package pl.synchronize.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.synchronize.model.Data;
import pl.synchronize.repository.DataRepository;

@RestController
public class DataController {
	
	
	DataRepository dataRepository;
	
	 @Autowired
	 public DataController(DataRepository dataRepository) {
	      this.dataRepository = dataRepository;
	  }
	
	@PostMapping(path = "/data")
	public ResponseEntity<Void> dataAdd(@RequestBody Data data) {
		dataRepository.save(data);
	    return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@DeleteMapping(path = "/data/{id}")
	public ResponseEntity<Void> dataRemove(@PathVariable Long id) {
		dataRepository.deleteById(id);
	    return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
