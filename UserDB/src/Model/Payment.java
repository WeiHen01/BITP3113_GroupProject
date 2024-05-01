package Model;

public class Payment {
	private int payment_id;
	private String payment_name;
	private String payment_type;
	private String payment_description;
	private double payment_amount;
	private String payment_date;
	private Treatment treatments;
	private Patient patients;
	
	public Payment()
	{}
	public Payment(int payment_id)
	{
		this.payment_id=payment_id;
	}

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public String getPayment_name() {
		return payment_name;
	}

	public void setPayment_name(String payment_name) {
		this.payment_name = payment_name;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getPayment_description() {
		return payment_description;
	}

	public void setPayment_description(String payment_description) {
		this.payment_description = payment_description;
	}

	public double getPayment_amount() {
		return payment_amount;
	}

	public void setPayment_amount(double payment_amount) {
		this.payment_amount = payment_amount;
	}

	public String getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}

	public Treatment getTreatments() {
		return treatments;
	}

	public void setTreatments(Treatment treatments) {
		this.treatments = treatments;
	}
	public Patient getPatients() {
		return patients;
	}

	public void setPatients(Patient patients) {
		this.patients = patients;
	}

	
}
