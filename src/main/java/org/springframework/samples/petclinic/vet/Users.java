package org.springframework.samples.petclinic.vet;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Users {

	private List<User> vets;

	@XmlElement
	public List<User> getUserList() {
		if (vets == null) {
			vets = new ArrayList<>();
		}
		return vets;
	}
}
