//A class for student information
public class Teacher {
    //Fields for the teachers' first name, last name and the subject they teach
    private String firstName;
    private String lastName;
    private String subject;

    //Default teacher info
    Teacher(){
        firstName = "n/a";
        lastName = "n/a";
        subject = "n/a";
    }

    //To create a teacher with custom info
    Teacher(String firstName, String lastName, String subject){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //So the teacher object can print with the message down below
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + " Subject: " + this.subject;
    }
}
