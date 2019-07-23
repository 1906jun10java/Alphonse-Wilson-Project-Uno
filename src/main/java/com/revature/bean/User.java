package com.revature.bean;

public class User {
	protected String userName;
	protected String userPass;
	protected boolean employee;
	protected boolean customer;
	protected String travelTo ;
	private int userId;
	private String empCust;
	private int car_id;
	private int user_id;
	private int offer_price;
	private int offer_id;
	private String userType;
	private int owned_amount_left;
	private String user_name;
	private String user_pass;
	private String user_FirstName;
	private String user_LastName;
	private String user_Phone;
	private String user_email;
	private int user_ManagerId;
	private String user_position;
	public int getOwned_amount_left() {
		return owned_amount_left;
	}
	public void setOwned_amount_left(int owned_amount_left) {
		this.owned_amount_left = owned_amount_left;
	}
	public User() {
		super();
	}
	public User(int userId, String userName, String userPass, String userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.userType = userType;
	}
	
	public String getUser() {
		return userName;
	}
	public void setUser(String user) {
		this.userName = user;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return userPass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.userPass = pass;
	}
	/**
	 * @return the employee
	 */
	public boolean getEmployee() {
		return employee;
	}
	public void setEmployee(boolean employee) {
		this.employee = employee;
	}
	/**
	 * @return the customer
	 */
	public boolean getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(boolean customer) {
		this.customer = customer;
	}
	public String getTravelTo() {
		return travelTo;
	}
	/**
	 * @param travelTo the travelTo to set
	 */
	public void setTravelTo(String travelTo) {
		this.travelTo = travelTo;
	}
	public int getUserId() {
		
		return userId;
	}
	public void setUserId(int userId) {
		
		this.userId = userId;
	}
	public void setType(String empCust) {
		this.empCust = empCust;
		
	}
	public String getType() {
		return empCust;
		
	}
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getOffer_price() {
		return offer_price;
	}
	public void setOffer_price(int offer_price) {
		this.offer_price = offer_price;
	}
	public int getOffer_id() {
		return offer_id;
	}
	public void setOffer_id(int offer_id) {
		this.offer_id = offer_id;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public String getUser_FirstName() {
		return user_FirstName;
	}
	public void setUser_FirstName(String user_FirstName) {
		this.user_FirstName = user_FirstName;
	}
	public String getUser_Phone() {
		return user_Phone;
	}
	public void setUser_Phone(String user_Phone) {
		this.user_Phone = user_Phone;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public int getUser_ManagerId() {
		return user_ManagerId;
	}
	public void setUser_ManagerId(int user_ManagerId2) {
		this.user_ManagerId = user_ManagerId2;
	}
	public String getUser_position() {
		return user_position;
	}
	public void setUser_position(String user_position) {
		this.user_position = user_position;
	}
	public String getUser_LastName() {
		return user_LastName;
	}
	public void setUser_LastName(String user_LastName) {
		this.user_LastName = user_LastName;
	}

}
