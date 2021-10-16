package phase1.inheritance;

class Teacher{
	private String Designation = "Teacher";
	private String collegeName = "Beginner'sBook";
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	void does() {
		System.out.println("Teaching");
		
	}	
}

public class SingleInherihance extends Teacher {
	String mainSubject = "Physics";
	public static void main(String[] args)
	{
		SingleInherihance obj = new SingleInherihance();
		System.out.println(obj.getCollegeName());
		System.out.println(obj.getDesignation());
		
		
				
	}

}
