/**
 * 
 */
package com.boltech.assignment.api.models;

/**
 * @author shardulsrivastava
 *
 */
public class Contacts {

	public Contacts(long id, String name, String username, String email, String phone, String website, String company) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.website = website;
		this.company = company;
	}

	private long id;
	private String name;
	private String username;
	private String email;
	private String phone;
	private String website;
	private String company;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

}
