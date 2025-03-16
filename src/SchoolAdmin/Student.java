package SchoolAdmin;

public class Student extends Person{
    protected String myIdNum;    // SchoolAdmin.Student Id Number
    protected double myGPA;      // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa)  {
        // use the super class’ constructor
        super(name, age, gender);
        // initialize what’s new to SchoolAdmin.Student
        myIdNum = idNum;
        myGPA = gpa;
    }

    public String getMyIdNum() {
        return myIdNum;
    }

    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public double getMyGPA() {
        return myGPA;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    @Override
    public String toString() {
        return super.toString() + ", SchoolAdmin.Student ID: " + myIdNum + ", GPA: " + myGPA;
    }

}
