package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import bean.Car;

public interface LotDAO {

	public abstract List<Car> getCarList() 
			throws SQLException;

}
