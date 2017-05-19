package sheet3ControlFlowStatements;

public class Ex12LoopsExaminationMarks{
	public static void main (String[]args){
		
		int exam1 = 30;
		int exam2 = 70;
		int exam3 = 50;
		int average = (exam1+exam2+exam3)/3;
		Ex12LoopsExaminationMarks exam = new Ex12LoopsExaminationMarks();
		
		exam.calculateMarks(exam1, exam2, exam3, average);
		
	}
	public void calculateMarks(int exam1, int exam2, int exam3, int average){
		if(exam1>=40 && exam2>=40 && exam3>=40){
			System.out.println("Well done you! You passed all 3 exams");
		}else if(exam1<40 && exam2>=40 && exam3>=40){
			System.out.println("First Exam failed, but if your average is greater than or equal to 50 you Pass." );
		}else if(exam1>=40 && exam2<40 && exam3>=40){
			System.out.println("Second Exam failed, but if your average is greater than or equal to 50 you Pass." );
		}else if(exam1>=40 && exam2>=40 && exam3<40){
			System.out.println("Third Exam failed, but if your average is greater than or equal to 50 you Pass." );
		}else;
		if(average>=50){
				System.out.println("Well done! Average is : " + average);
			}else{
				System.out.println("Failed. Average is only : " + average);
				}
	}
}
	