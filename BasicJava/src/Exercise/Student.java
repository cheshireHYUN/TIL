package Exercise;

public class Student extends Human implements Comparable<Student>{
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
	
	
	@Override
	public int compareTo(Student o) {
		if(this.getName().compareTo(o.getName())>0){
			return 1;
		} else if (this.getName().compareTo(o.getName())<0) {
			return -1;
		} else {
			return 0;
		}
	}

}
