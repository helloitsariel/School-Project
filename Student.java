//A class for student information
public class Student {
    //Fields for the students' first name, last name, grade and their student ID which is the number created on construction
    private String firstName;
    private String lastName;
    private String grade;
    private static int studentNumber = 1;
    private int idNum;

    //Default student info
    Student(){
        firstName = "n/a";
        lastName = "n/a";
        grade = "n/a";
        idNum = studentNumber;
        studentNumber++;
    }
    //To create with custom info
    Student(String firstName, String lastName, String grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        idNum = studentNumber;
        studentNumber++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
    //So the student object can print with the message down below
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + " Grade: " + this.grade;
    }
}
