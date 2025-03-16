package SchoolAdmin;

public class Person {


    protected String myName ;   // name of the person
    protected int myAge;        // person’s age
    protected String myGender;  // “M” for male, “F” for female, "N" for nonbinary

    public Person(String name, int age, String gender)  {
        myName = name;
        myAge = age;
        myGender = gender;
    }


    //1. Add methods to “set” and “get” the instance variables in the SchoolAdmin.Person class.
    // These would consist of: getName, getAge, getGender, setName,  setAge, and setGender.


    public String getMyName() {
        return myName;
    }

    public String getMyGender() {
        return myGender;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String toString()  {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }


}
