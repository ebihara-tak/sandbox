package sandbox.rmi.struct;

public class Account implements IAccount {
	private String name;
	private String sex;
	
	public Account(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", sex=" + sex + "]";
	}
	
}
