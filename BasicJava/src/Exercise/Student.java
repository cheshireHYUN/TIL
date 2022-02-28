package Exercise;

public class Student extends Human{
	private String major;
	
	public Student(String name, int age, String major) {
		this.major = major;
		setName(name);
		setAge(age);
	}
	
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String toString() {
		
		return super.toString()+", Àü°ø: "+major;
	}

}
