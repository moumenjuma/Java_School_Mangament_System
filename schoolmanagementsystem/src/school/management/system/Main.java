package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**Work of Moumen Juma
 * This class in responsible for keep the track of students.
 * fees, name, id, grade, feespaid.
 */

public class Main {

    public static void main(String[] args) {
		/*
		* if adding more teacher add below 
		* Teacher TeacherName = new Teacher( id, TeacherName, Salary);
		*/
		Teacher Andrew = new Teacher(1,"Andrew Smith",1000);
		Teacher Dana = new Teacher(2,"Dan White",700);
		Teacher Anni = new Teacher(3,"Anni Brown",800);
		//make sure to add to teacherList
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Andrew);
		teacherList.add(Dana);
		teacherList.add(Anni);

		/*
		* if adding more Students add below 
		* Student StudentName = new Student( id, StudentName, Grade);
		*/
		Student Nash = new Student(1,"Nash Kite",10);
		Student Crash = new Student(2,"Crash Cole",11);
		Student daniel = new Student(3,"Daniel Paroo",12);

		//make sure to add to studentList
		List<Student> studentList = new ArrayList<>();
		studentList.add(Nash);
		studentList.add(daniel);
		studentList.add(Crash);


		School Pschool = new School(teacherList, studentList);

		//just for adding new teacher by addmethod, same applies to students also
		Teacher kira = new Teacher(4,"Kira Adams",600);
		Pschool.addTeacher(kira);

		daniel.payFees(5000);
		Nash.payFees(6000);

		System.out.println("-----\t\tPublic School Fund Earned: $" + Pschool.getTotalMoneyEarned()+"\t\t\t-----");

		System.out.println("-----\t\tPublic School Paid SALARY\t\t\t\t-----");

		Andrew.receiveSalary(Andrew.getSalary());
		System.out.println("Salary To: " + Andrew.getName()+"\t\t||\tRemaining Money Is: $"+ Pschool.getTotalMoneyEarned());

		Dana.receiveSalary(Dana.getSalary());
		System.out.println("Salary To: " + Dana.getName()+"\t\t||\tRemaining Money Is: $"+ Pschool.getTotalMoneyEarned());

		//loop to print everthing in the student list
		System.out.println("-------------------------------------------------------------");
		for(int i=0;i<studentList.size();i++){
			System.out.println(studentList.get(i));
		}
		//loop to print everthing in the teacher list
		System.out.println("--------------------------------------------------------------");
		for(int i=0;i<teacherList.size();i++){
			System.out.println(teacherList.get(i));
		}

    }



}
