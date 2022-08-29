package dk.finetech.sales.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderProcessedEvent {

	public OrderProcessedEvent () {
	}

	public OrderProcessedEvent (
		String id, 
		String source, 
		String specversion, 
		String type, 
		String datacontenttype, 
		String dataschema, 
		String subject, 
		String time, 
		AssessedOrder assessedOrder, 
		String dataBase64) {
		this.id = id;
		this.source = source;
		this.specversion = specversion;
		this.type = type;
		this.datacontenttype = datacontenttype;
		this.dataschema = dataschema;
		this.subject = subject;
		this.time = time;
		this.assessedOrder = assessedOrder;
		this.dataBase64 = dataBase64;
	}

	private String id;
	private String source;
	private String specversion;
	private String type;
	private String datacontenttype;
	private String dataschema;
	private String subject;
	private String time;
	@JsonProperty("data")
	private AssessedOrder assessedOrder;
	@JsonProperty("data_base64")
	private String dataBase64;
	public String getId() {
		return id;
	}

	public OrderProcessedEvent setId(String id) {
		this.id = id;
		return this;
	}


	public String getSource() {
		return source;
	}

	public OrderProcessedEvent setSource(String source) {
		this.source = source;
		return this;
	}


	public String getSpecversion() {
		return specversion;
	}

	public OrderProcessedEvent setSpecversion(String specversion) {
		this.specversion = specversion;
		return this;
	}


	public String getType() {
		return type;
	}

	public OrderProcessedEvent setType(String type) {
		this.type = type;
		return this;
	}


	public String getDatacontenttype() {
		return datacontenttype;
	}

	public OrderProcessedEvent setDatacontenttype(String datacontenttype) {
		this.datacontenttype = datacontenttype;
		return this;
	}


	public String getDataschema() {
		return dataschema;
	}

	public OrderProcessedEvent setDataschema(String dataschema) {
		this.dataschema = dataschema;
		return this;
	}


	public String getSubject() {
		return subject;
	}

	public OrderProcessedEvent setSubject(String subject) {
		this.subject = subject;
		return this;
	}


	public String getTime() {
		return time;
	}

	public OrderProcessedEvent setTime(String time) {
		this.time = time;
		return this;
	}


	public AssessedOrder getAssessedOrder() {
		return assessedOrder;
	}

	public OrderProcessedEvent setAssessedOrder(AssessedOrder assessedOrder) {
		this.assessedOrder = assessedOrder;
		return this;
	}


	public String getDataBase64() {
		return dataBase64;
	}

	public OrderProcessedEvent setDataBase64(String dataBase64) {
		this.dataBase64 = dataBase64;
		return this;
	}

	public String toString() {
		return "OrderProcessedEvent ["
		+ " id: " + id
		+ " source: " + source
		+ " specversion: " + specversion
		+ " type: " + type
		+ " datacontenttype: " + datacontenttype
		+ " dataschema: " + dataschema
		+ " subject: " + subject
		+ " time: " + time
		+ " assessedOrder: " + assessedOrder
		+ " dataBase64: " + dataBase64
		+ " ]";
	}
}
