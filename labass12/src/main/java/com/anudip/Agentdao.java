package com.anudip;

import org.springframework.jdbc.core.JdbcTemplate;

public class Agentdao {
private JdbcTemplate jdbcTemplate;
public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
{
	this.jdbcTemplate=jdbcTemplate;
}

public int saveAgent(Agent a)
{
	String query="insert into Agent1 value('"+a.getId()+"','"+a.getName()+"','"+a.getCommission()+"')";
	return jdbcTemplate.update(query);
}

public int updateAgent(Agent a)
{
	String query1="update Agent1 set commission='"+a.getCommission()+"' where id='"+a.getId()+"'";
	return jdbcTemplate.update(query1);
}

public int deleteAgent(Agent a)
{
	String query2="delete from Agent1 where id='"+a.getId()+"'";
	return jdbcTemplate.update(query2);
}
}
