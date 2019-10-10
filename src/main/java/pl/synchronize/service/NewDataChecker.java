package pl.synchronize.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import pl.synchronize.model.CoppiedData;
import pl.synchronize.repository.CoppiedDataRepository;
@Service
public class NewDataChecker {
    	private static final Logger logger = LoggerFactory.getLogger(NewDataChecker.class);

	    @Autowired
		CoppiedDataRepository coppiedDataRepository;
	
	    @Scheduled(fixedDelay=1000)
	    public void checkRecords() {	
	    	List<CoppiedData> coppiedData = coppiedDataRepository.findAdded(); 
	    	if(coppiedData.size()>0)
	    		logger.info("Add " + coppiedData.size() + " data");
	    	coppiedDataRepository.saveAll(coppiedData);
	    	
	    	List<CoppiedData> deletedData = coppiedDataRepository.findDeleted(); 
	    	if(deletedData.size()>0)
	    		logger.info("Delete " + deletedData.size() + " data");
	    	coppiedDataRepository.deleteAll(deletedData);
	    }
	
}
