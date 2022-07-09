package school.management.system;

/**Work of Moumen Juma
 * This class in responsible for keep the track of students.
 * fees, name, id, grade, feespaid.
 */
public class Student {
    //declaring the field.
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //Creating a new constructor-> special function

    /**
     * To create a new Student object by initializing
     * Fees for every student is $30,000 p.a.
     * Fees paid initially is $0.00.
     * @param id id for the student: unique value
     * @param name name of the student: may be unique or not
     * @param grade grade/class of the student
     */
    public Student(int id, String name,int grade){
        //initializing the field inside constructor.
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;


    }

    //Not going to alter student's name, student's id.
    //Not going to change feesTotal.
    //Going to alter grade,
    //Going to update student feesPaid.


    /**
     * Used to update the student's grade.
     * @param grade new grade of student.
     */
    public void setGrade(int grade){
        this.grade = grade;

    }

    /**
     * initially 0 -> paid 10,000 -> feesPaid 10,000
     * again, fessPaid = 10,000 + 5,000 + 15,000
     * Basically, fees keep adding to feesPaid Field
     * Add the fees to the feesPaid
     * The school is going to receive the funds/fees.
     * Pays the selected amount as fees to the school
     * @param fees the fees that the student pays
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);


    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade/class of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return feesPaid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return totalFees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    /**
     *
     * @return "prints Statements"
     */
    @Override
    public String toString() {
        return "Student's Name: "+id+". "+name+"\t||\tTotal Fees Paid: $" + feesPaid+"\t||\tRemains: $"+getRemainingFees();
    }
}
