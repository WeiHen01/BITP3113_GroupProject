package Model;

import Model.Payment;
public class Treatment {
	private int treatment_id;
	private String treatment_name;
	private String treatment_type;
	private String treatment_description;
	private String treatment_date;
	private double treatment_price;
	private String treatment_status;
	private Payment payment;
	
	public Treatment() {}
	
	public int getTreatment_id() {
		return treatment_id;
	}
	public void setTreatment_id(int treatment_id) {
		this.treatment_id = treatment_id;
	}
	public String getTreatment_name() {
		return treatment_name;
	}
	public void setTreatment_name(String treatment_name) {
		this.treatment_name = treatment_name;
	}
	public String getTreatment_type() {
		return treatment_type;
	}
	public void setTreatment_type(String treatment_type) {
		this.treatment_type = treatment_type;
	}
	public String getTreatment_description() {
		return treatment_description;
	}
	public void setTreatment_description(String treatment_description) {
		this.treatment_description = treatment_description;
	}
	public String getTreatment_date() {
		return treatment_date;
	}
	public void setTreatment_date(String treatment_date) {
		this.treatment_date = treatment_date;
	}

	public double getTreatment_price() {
		return treatment_price;
	}

	public void setTreatment_price(double treatment_price) {
		this.treatment_price = treatment_price;
	}

	public String getTreatment_status() {
		return treatment_status;
	}

	public void setTreatment_status(String treatment_status) {
		this.treatment_status = treatment_status;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	
}