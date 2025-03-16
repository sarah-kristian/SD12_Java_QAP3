package SchoolAdmin;

public class Teacher extends Person{

    protected String mySubject;    // Subject taught subject (e.g. “Computer Science”, “Chemistry”, “English”, “Other”)
    protected double mySalary;     // annual salary

    public Teacher(String name, int age, String gender, String mySubject, double mySalary) {
        super(name, age, gender);
        this.mySubject = mySubject;
        this.mySalary = mySalary;
    }

    public String getMySubject() {
        return mySubject;
    }

    public void setMySubject(String mySubject) {
        this.mySubject = mySubject;
    }

    public double getMySalary() {
        return mySalary;
    }

    public void setMySalary(double mySalary) {
        this.mySalary = mySalary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Salary: " + mySalary;
    }

}
