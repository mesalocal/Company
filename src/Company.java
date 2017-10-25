import java.util.ArrayList;

public class Company {
	public Company(String _name, String _location, ArrayList<Employee> _employees) {
		super();
		this._name = _name;
		this._location = _location;
		this._employees = _employees;
	}

	private String _name;
	private String _location;
	public ArrayList<Employee> _employees = new ArrayList<Employee>();

	public void payEmployees() {
		throw new UnsupportedOperationException();
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_location() {
		return _location;
	}

	public void set_location(String _location) {
		this._location = _location;
	}

	public ArrayList<Employee> get_employees() {
		return _employees;
	}

	public void set_employees(ArrayList<Employee> _employees) {
		this._employees = _employees;
	}
}