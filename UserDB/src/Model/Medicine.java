package Model;

public class Medicine {
	private int medicine_id;
	private String medicine_name;
	private String medicine_type;
	private String medicine_company;
	private double medicine_cost;
	private String medicine_status;
	private Nurse nurse;
	
	public Medicine() {}

	public int getMedicine_id() {
		return medicine_id;
	}

	public void setMedicine_id(int medicine_id) {
		this.medicine_id = medicine_id;
	}

	public String getMedicine_name() {
		return medicine_name;
	}

	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}

	public String getMedicine_type() {
		return medicine_type;
	}

	public void setMedicine_type(String medicine_type) {
		this.medicine_type = medicine_type;
	}

	public String getMedicine_company() {
		return medicine_company;
	}

	public void setMedicine_company(String medicine_company) {
		this.medicine_company = medicine_company;
	}

	public double getMedicine_cost() {
		return medicine_cost;
	}

	public void setMedicine_cost(double medicine_cost) {
		this.medicine_cost = medicine_cost;
	}

	public String getMedicine_status() {
		return medicine_status;
	}

	public void setMedicine_status(String medicine_status) {
		this.medicine_status = medicine_status;
	}

	public Nurse getNurse() {
		return nurse;
	}

	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}
}