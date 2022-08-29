package dk.finetech.sales.order;

import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssessedOrder {

	public AssessedOrder () {
	}

	public AssessedOrder (
		String status, 
		Order order) {
		this.status = status;
		this.order = order;
	}

	private String status;
	private Order order;
	public String getStatus() {
		return status;
	}

	public AssessedOrder setStatus(String status) {
		this.status = status;
		return this;
	}


	public Order getOrder() {
		return order;
	}

	public AssessedOrder setOrder(Order order) {
		this.order = order;
		return this;
	}

	public String toString() {
		return "AssessedOrder ["
		+ " status: " + status
		+ " order: " + order
		+ " ]";
	}
}
