package dk.finelab.product.service.client.app;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class MatchCriterion {

	public MatchCriterion () {
	}

	public MatchCriterion (
		String name, 
		String value) {
		this.name = name;
		this.value = value;
	}

	private String name;
	private String value;
	public String getName() {
		return name;
	}

	public MatchCriterion setName(String name) {
		this.name = name;
		return this;
	}


	public String getValue() {
		return value;
	}

	public MatchCriterion setValue(String value) {
		this.value = value;
		return this;
	}

	public String toString() {
		return "MatchCriterion ["
		+ " name: " + name
		+ " value: " + value
		+ " ]";
	}
}
