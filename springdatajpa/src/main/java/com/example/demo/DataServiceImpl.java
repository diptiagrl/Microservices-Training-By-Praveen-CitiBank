package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {
	
	@Autowired
	SscRepository repo;

	@Override
	public List<Ssc> getAllData() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Ssc postData(Ssc ssc) {
		// TODO Auto-generated method stub
		return repo.save(ssc);
	}

}
