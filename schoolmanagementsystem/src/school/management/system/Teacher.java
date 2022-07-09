package school.management.system;
/**Work of Moumen Juma
 * This class in responsible for keeping the track of teachers
 * id, name, salary.
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

//    Creating a constructor

    /**
     * This constructor is responsible for creating new Teacher's Object.
     * @param id id for the teacher. not going to change id, if it's set
     * @param name name of the teacher. not going to change name, if it's set
     * @param salary salary of the teacher. going to change id, if it's a promotion
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }
//    we need to get id, name, salary of the teacher

    /**
     *
     * @return id for the teacher
     */
    public int getId(){
        return id;
    }

    /**
     * @return name of the teacher
     */
    public String getName(){
        return name;
    }

    /**
     * @return salary of the teacher
     */
    public int getSalary(){
        return salary;
    }

    /**
     * Set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * ADDS to the salaryEarned.
     * REMOVES from the TOTAL MONEY earned by the SCHOOL
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's Name:"+id+". "+name+"\t||\tTotal Salary Earned: $"+ salaryEarned;
    }
}
