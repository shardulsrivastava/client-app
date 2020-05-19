/**
 * 
 */
package com.boltech.assignment.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boltech.assignment.api.models.Client;

/**
 * @author shardulsrivastava
 *
 */
@RestController
public class ApiController {

	@CrossOrigin
	@GetMapping("/clients")
	public List<Client> getClients() {
		List<Client> clientList = new ArrayList<Client>();
		Client client = new Client(1, "Shardul Srivastava", "Shardul", "shardul.srivastava@iproperty.com", "0102439054",
				"shardul.org", "REA Group Asia");
		clientList.add(client);
		return clientList;
	}

}
