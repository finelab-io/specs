package dk.finetech.sales.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderPlacedEvent {

	public OrderPlacedEvent () {
	}

	public OrderPlacedEvent (
		String id, 
		String source, 
		String specversion, 
		String type, 
		String datacontenttype, 
		String dataschema, 
		String subject, 
		String time, 
		Order order, 
		String dataBase64) {
		this.id = id;
		this.source = source;
		this.specversion = specversion;
		this.type = type;
		this.datacontenttype = datacontenttype;
		this.dataschema = dataschema;
		this.subject = subject;
		this.time = time;
		this.order = order;
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
	private Order order;
	@JsonProperty("data_base64")
	private String dataBase64;
	public String getId() {
		return id;
	}

	public OrderPlacedEvent setId(String id) {
		this.id = id;
		return this;
	}


	public String getSource() {
		return source;
	}

	public OrderPlacedEvent setSource(String source) {
		this.source = source;
		return this;
	}


	public String getSpecversion() {
		return specversion;
	}

	public OrderPlacedEvent setSpecversion(String specversion) {
		this.specversion = specversion;
		return this;
	}


	public String getType() {
		return type;
	}

	public OrderPlacedEvent setType(String type) {
		this.type = type;
		return this;
	}


	public String getDatacontenttype() {
		return datacontenttype;
	}

	public OrderPlacedEvent setDatacontenttype(String datacontenttype) {
		this.datacontenttype = datacontenttype;
		return this;
	}


	public String getDataschema() {
		return dataschema;
	}

	public OrderPlacedEvent setDataschema(String dataschema) {
		this.dataschema = dataschema;
		return this;
	}


	public String getSubject() {
		return subject;
	}

	public OrderPlacedEvent setSubject(String subject) {
		this.subject = subject;
		return this;
	}


	public String getTime() {
		return time;
	}

	public OrderPlacedEvent setTime(String time) {
		this.time = time;
		return this;
	}


	public Order getOrder() {
		return order;
	}

	public OrderPlacedEvent setOrder(Order order) {
		this.order = order;
		return this;
	}


	public String getDataBase64() {
		return dataBase64;
	}

	public OrderPlacedEvent setDataBase64(String dataBase64) {
		this.dataBase64 = dataBase64;
		return this;
	}

	public String toString() {
		return "OrderPlacedEvent ["
		+ " id: " + id
		+ " source: " + source
		+ " specversion: " + specversion
		+ " type: " + type
		+ " datacontenttype: " + datacontenttype
		+ " dataschema: " + dataschema
		+ " subject: " + subject
		+ " time: " + time
		+ " order: " + order
		+ " dataBase64: " + dataBase64
		+ " ]";
	}
}
