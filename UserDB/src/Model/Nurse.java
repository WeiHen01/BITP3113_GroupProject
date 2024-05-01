package Model;
public class Nurse {
	private int nurse_id;
	private String nurse_nophone;
	private String nurse_email;
	private String nurse_name;
	private String nurse_password;
	private String nurse_address;
	private String nurse_username;
	private String nurse_status;
	private Doctor doctor;
	
	public Nurse() {}

	public int getNurse_id() {
		return nurse_id;
	}

	public void setNurse_id(int nurse_id) {
		this.nurse_id = nurse_id;
	}

	public String getNurse_nophone() {
		return nurse_nophone;
	}

	public void setNurse_nophone(String nurse_nophone) {
		this.nurse_nophone = nurse_nophone;
	}

	public String getNurse_email() {
		return nurse_email;
	}

	public void setNurse_email(String nurse_email) {
		this.nurse_email = nurse_email;
	}

	public String getNurse_name() {
		return nurse_name;
	}

	public void setNurse_name(String nurse_name) {
		this.nurse_name = nurse_name;
	}

	public String getNurse_password() {
		return nurse_password;
	}

	public void setNurse_password(String nurse_password) {
		this.nurse_password = nurse_password;
	}
	
	public String getNurse_address() {
		return nurse_address;
	}

	public void setNurse_address(String nurse_address) {
		this.nurse_address = nurse_address;
	}

	public String getNurse_username() {
		return nurse_username;
	}

	public void setNurse_username(String nurse_username) {
		this.nurse_username = nurse_username;
	}

	public String getNurse_status() {
		return nurse_status;
	}

	public void setNurse_status(String nurse_status) {
		this.nurse_status = nurse_status;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
}
