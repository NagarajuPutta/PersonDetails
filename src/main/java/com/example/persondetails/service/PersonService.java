package com.example.persondetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

import com.example.persondetails.fields.PersonFields;

@Service
public class PersonService {

	@Autowired
	NamedParameterJdbcTemplate namedJdbc;
	
	public int insertion(PersonFields pfields)
	{
		String sql="insert into person values(:sno,:name,:address,:phnno)";
		SqlParameterSource param=new MapSqlParameterSource()
				.addValue("sno", pfields.getSno())
				.addValue("name", pfields.getName())
				.addValue("address", pfields.getAddress())
				.addValue("phnno", pfields.getPhnno());
		return namedJdbc.update(sql, param);
	}
	    
    public int updation(PersonFields pfields)
	{
        String sql="update person set name=:name where address=:address";
        SqlParameterSource param=new MapSqlParameterSource()
    		.addValue("name", pfields.getName())
    		.addValue("address", pfields.getAddress());
    return namedJdbc.update(sql,param);
	}
    
     public int deletion(PersonFields pfields)
    {
    	String sql="delete from person where sno=:sno";
    	SqlParameterSource param=new MapSqlParameterSource()
    			.addValue("sno", pfields.getSno());
    	return  namedJdbc.update(sql, param);
    }
     
     public List getting(PersonFields pfields)
     {
    	 String sql="select * from person name";
    	 SqlParameterSource param=new MapSqlParameterSource();
    	 return namedJdbc.queryForList(sql, param);
     }
	
}
