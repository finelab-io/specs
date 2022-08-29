package dk.finetech.sales.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProcessedOrder {

	public ProcessedOrder () {
	}

	public ProcessedOrder (
		String status, 
		Order order, 
		String signatureId, 
		String signatureUrl) {
		this.status = status;
		this.order = order;
		this.signatureId = signatureId;
		this.signatureUrl = signatureUrl;
	}

	private String status;
	private Order order;
	@JsonProperty("signature_id")
	private String signatureId;
	@JsonProperty("signature_url")
	private String signatureUrl;
	public String getStatus() {
		return status;
	}

	public ProcessedOrder setStatus(String status) {
		this.status = status;
		return this;
	}


	public Order getOrder() {
		return order;
	}

	public ProcessedOrder setOrder(Order order) {
		this.order = order;
		return this;
	}


	public String getSignatureId() {
		return signatureId;
	}

	public ProcessedOrder setSignatureId(String signatureId) {
		this.signatureId = signatureId;
		return this;
	}


	public String getSignatureUrl() {
		return signatureUrl;
	}

	public ProcessedOrder setSignatureUrl(String signatureUrl) {
		this.signatureUrl = signatureUrl;
		return this;
	}

	public String toString() {
		return "ProcessedOrder ["
		+ " status: " + status
		+ " order: " + order
		+ " signatureId: " + signatureId
		+ " signatureUrl: " + signatureUrl
		+ " ]";
	}
}
