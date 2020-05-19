/**
 * 
 */
package com.boltech.assignment.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boltech.assignment.api.models.Contacts;

/**
 * @author shardulsrivastava
 *
 */
@RestController
public class ApiController {

	@CrossOrigin
	@GetMapping("/clients")
	public List<Contacts> getClients() {
		List<Contacts> contactList = new ArrayList<Contacts>();
		//Contacts contact1 = new Contacts(1, "Leanne Graham", "Bret", "Sincere@april.biz", "1-770-736-8031 x56442",
				//"hildegard.org", "Romaguera-Crona");
		Contacts contact2 = new Contacts(1, "Shardul Srivastava", "Shardul", "shardul.srivastava@iproperty.com",
				"0102439054", "shardul.org", "REA Group Asia");
		//contactList.add(contact1);
		contactList.add(contact2);
		return contactList;
	}

}
