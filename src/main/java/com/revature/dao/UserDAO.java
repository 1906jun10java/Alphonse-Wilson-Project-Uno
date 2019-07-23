package com.revature.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import bean.User;

public interface UserDAO {
	
	public List<User> getUser() throws SQLException;
	public User getUserById(String id) throws SQLException;
	public User getUserById(String id, Connection conn);
	public int createUser(User user) throws SQLException;
}
