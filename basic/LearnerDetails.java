package basic;

public class LearnerDetails {
	public void Learner() {
		String name = "Syed";
		String degree = "BE";
		String Location = "Bangalore";
		int rollnumber = 1234;
		
		System.out.println("Name: "+name);
		System.out.println("Degree: "+degree);
		System.out.println("Location: "+Location);
		System.out.println("Roll Number: "+rollnumber);
		
	}

	public static void main(String args[]) {
    LearnerDetails l = new LearnerDetails();
    l.Learner();

}
}
