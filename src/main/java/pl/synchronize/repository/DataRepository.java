package pl.synchronize.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.synchronize.model.Data;

@Repository
public interface DataRepository extends CrudRepository<Data, Long>{

}
