package com.wathare.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.wathare.entity.JsonData;

@Repository
public class DataDaoImpl implements DataDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<JsonData> getalldata() {
		List<JsonData> lst=jdbcTemplate.query("select * from sampledata",(rs,num)->{
			JsonData p=new JsonData(rs.getString(1),rs.getInt(2),rs.getInt(3));
			return p;
		});
		return lst;
	}

}
