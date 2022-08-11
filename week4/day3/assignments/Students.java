package week4.day3.assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id,String Name) {
		System.out.println(id+"  "+	Name);
	}
	public void getStudentInfo(String Email,int PhoneNumber) {
		System.out.println(Email+"   "+PhoneNumber);
	}
	public static void main(String[] args) {
		Students std=new Students();
		std.getStudentInfo(1);
		std.getStudentInfo(1, "Ravikumar M");
		std.getStudentInfo("ravimani10599@gmail.com", 1);
	}
}
