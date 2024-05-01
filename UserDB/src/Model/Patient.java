package Model;

public class Patient {
	
	private int patient_id;
	private String patient_name;
	private String patient_nophone;
	private String patient_address;
	private String patient_email;
	private String patient_password;
	private String patient_username;
	private String patient_status;
	private int patient_age;
	private String patient_gender;
	private int sum_gender;
	private int sumGenderF;
	private int sumGenderM;
	
	public Patient() {}
	
	public Patient(int patient_id) 
	{
		this.patient_id = patient_id;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getPatient_nophone() {
		return patient_nophone;
	}

	public void setPatient_nophone(String patient_nophone) {
		this.patient_nophone = patient_nophone;
	}

	public String getPatient_address() {
		return patient_address;
	}

	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}

	public String getPatient_email() {
		return patient_email;
	}

	public void setPatient_email(String patient_email) {
		this.patient_email = patient_email;
	}

	public String getPatient_password() {
		return patient_password;
	}

	public void setPatient_password(String patient_password) {
		this.patient_password = patient_password;
	}

	public String getPatient_username() {
		return patient_username;
	}

	public void setPatient_username(String patient_username) {
		this.patient_username = patient_username;
	}

	public String getPatient_status() {
		return patient_status;
	}

	public void setPatient_status(String patient_status) {
		this.patient_status = patient_status;
	}

	public int getPatient_age() {
		return patient_age;
	}

	public void setPatient_age(int patient_age) {
		this.patient_age = patient_age;
	}

	public String getPatient_gender() {
		return patient_gender;
	}

	public void setPatient_gender(String patient_gender) {
		this.patient_gender = patient_gender;
	}

	public int getSumGender() {
		return sum_gender;
	}

	public void setSumGender(int sum_gender) {
		this.sum_gender = sum_gender;
	}

	public int getSumGenderF() {
		return sumGenderF;
	}

	public int getSumGenderM() {
		return sumGenderM;
	}

	public void setSumGenderF(int sumGenderF) {
		this.sumGenderF = sumGenderF;
	}

	public void setSumGenderM(int sumGenderM) {
		this.sumGenderM = sumGenderM;
	}
	
}
