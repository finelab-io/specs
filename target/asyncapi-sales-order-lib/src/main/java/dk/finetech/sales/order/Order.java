package dk.finetech.sales.order;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order {

	public Order () {
	}

	public Order (
		String number, 
		Quote quote, 
		Person person, 
		Organization organization) {
		this.number = number;
		this.quote = quote;
		this.person = person;
		this.organization = organization;
	}

	private String number;
	private Quote quote;
	private Person person;
	private Organization organization;
	public String getNumber() {
		return number;
	}

	public Order setNumber(String number) {
		this.number = number;
		return this;
	}


	public Quote getQuote() {
		return quote;
	}

	public Order setQuote(Quote quote) {
		this.quote = quote;
		return this;
	}



	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Quote {

		public Quote () {
		}


		public String toString() {
			return "Quote ["
			+ " ]";
		}
	}

	public Person getPerson() {
		return person;
	}

	public Order setPerson(Person person) {
		this.person = person;
		return this;
	}



	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Person {

		public Person () {
		}


		public String toString() {
			return "Person ["
			+ " ]";
		}
	}

	public Organization getOrganization() {
		return organization;
	}

	public Order setOrganization(Organization organization) {
		this.organization = organization;
		return this;
	}



	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Organization {

		public Organization () {
		}


		public String toString() {
			return "Organization ["
			+ " ]";
		}
	}
	public String toString() {
		return "Order ["
		+ " number: " + number
		+ " quote: " + quote
		+ " person: " + person
		+ " organization: " + organization
		+ " ]";
	}
}
