import java.util.ArrayList;
import java.util.Arrays;

//A class for all the school information, including information from teachers and students
public class School {
    //Lists for the teachers, students, and courses
    ArrayList<Teacher> teachers;
    ArrayList<Student> students;
    ArrayList<String> courses;
    //Fields for the name of the school, their school colour(s) and their school district
    private String name;
    private String schoolColour;
    private String district;

    //Default school info
    School(){
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        courses = new ArrayList<>();
        name = "n/a";
        schoolColour = "n/a";
        district = "n/a";
    }

    //To create with custom info
    School(String name, String schoolColour, String district){
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        courses = new ArrayList<>(
                Arrays.asList("Math", "Science", "Social Studies", "English", "French", "Art", "Music"));
        this.name = name;
        this.schoolColour = schoolColour;
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolColour() {
        return schoolColour;
    }

    public void setSchoolColour(String schoolColour) {
        this.schoolColour = schoolColour;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    //Adds a course to the end of the courses list
    public void addCourse(String a){
        courses.add(a);
    }

    //Removes a specified course from the courses list
    public void removeCourse(String a){
        courses.remove(a);
    }

    //Adds a teacher to the end of the teachers list
    public void addTeacher(Teacher a){
        teachers.add(a);
    }

    //Removes a specified teacher from the teacher list
    public void removeTeacher(Teacher a){
        teachers.remove(a);
    }

    //Adds a student to the end of the students list
    public void addStudent(Student a){
        students.add(a);
    }

    //Removes a specified student from the students list
    public void removeStudent(Student a){
        students.remove(a);
    }

    //So the school object can print with the message down below
    public String toString(){
        return "Name: " + this.name + "   District: " + this.district +
                "   School Colour(s): " + this.schoolColour + "\n" +
                "Courses: " + courses + "\n" +
                "Teachers: " + teachers + "\n" +
                "Students: " + students + "\n";
    }
}
