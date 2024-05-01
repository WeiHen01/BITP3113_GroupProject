package Model;

public class Doctor {
	private int doctor_id;
	private String doctor_name;
	private String doctor_nophone;
	private String doctor_email;
	private String doctor_address;
	private String doctor_username;
	private String doctor_password;
	private String doctor_status;
	
	public Doctor()
	{}
	
	public Doctor(int doctor_id) 
	{
		this.doctor_id = doctor_id;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getDoctor_nophone() {
		return doctor_nophone;
	}

	public void setDoctor_nophone(String doctor_nophone) {
		this.doctor_nophone = doctor_nophone;
	}

	public String getDoctor_email() {
		return doctor_email;
	}

	public void setDoctor_email(String doctor_email) {
		this.doctor_email = doctor_email;
	}

	public String getDoctor_address() {
		return doctor_address;
	}

	public void setDoctor_address(String doctor_address) {
		this.doctor_address = doctor_address;
	}

	public String getDoctor_username() {
		return doctor_username;
	}

	public void setDoctor_username(String doctor_username) {
		this.doctor_username = doctor_username;
	}

	public String getDoctor_password() {
		return doctor_password;
	}

	public void setDoctor_password(String doctor_password) {
		this.doctor_password = doctor_password;
	}

	public String getDoctor_status() {
		return doctor_status;
	}

	public void setDoctor_status(String doctor_status) {
		this.doctor_status = doctor_status;
	}

	
}
