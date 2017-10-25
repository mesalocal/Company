public class Employee {
	public Employee(String _lastname, String _firstName, String _jobTitle) {
		super();
		this._lastname = _lastname;
		this._firstName = _firstName;
		this._jobTitle = _jobTitle;
	}
	private String _lastname;
	private String _firstName;
	private String _jobTitle;
	public String get_lastname() {
		return _lastname;
	}
	public void set_lastname(String _lastname) {
		this._lastname = _lastname;
	}
	public String get_firstName() {
		return _firstName;
	}
	public void set_firstName(String _firstName) {
		this._firstName = _firstName;
	}
	public String get_jobTitle() {
		return _jobTitle;
	}
	public void set_jobTitle(String _jobTitle) {
		this._jobTitle = _jobTitle;
	}
}