package com.wathare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wathare.dao.DataDao;
import com.wathare.entity.JsonData;

@Service
public class DataServiceImpl implements DataService{
	
	@Autowired
	private DataDao ddao;

	@Override
	public List<JsonData> getAll() {
		return ddao.getalldata();
	}

}
