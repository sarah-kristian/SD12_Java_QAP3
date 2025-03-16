package SchoolAdmin;

public class CollegeStudent extends Student {
    protected String myMajor;    // (e.g. “Electrical Engineering”, “Communications”, “Undeclared”)
    protected int myYear;        // (e.g. FROSH = 1,  SOPH = 2, …)


    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int myYear, String myMajor) {
        super(name, age, gender, idNum, gpa);
        this.myMajor = myMajor;
        this.myYear = myYear;
    }

    public String getMyMajor() {
        return myMajor;
    }

    public void setMyMajor(String myMajor) {
        this.myMajor = myMajor;
    }

    public int getMyYear() {
        return myYear;
    }

    public void setMyYear(int myYear) {
        this.myYear = myYear;
    }

    public String toString() {
        return super.toString() + ", Major: " + myMajor + ", Year: " + myYear;
    }

}
