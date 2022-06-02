public class Main {
    public static void main(String[] args) {
        Teacher one = new Teacher("one", "one", "Math");
        Teacher two = new Teacher("two", "two", "Science");
        Teacher three = new Teacher("three", "three", "Art");
        Student four = new Student("four", "four","one");
        Student five = new Student("five", "five", "two");
        Student six = new Student("six", "six", "three");
        Student seven = new Student("seven", "seven","four");
        Student eight = new Student("eight", "eight", "five");
        Student nine = new Student("nine", "nine", "six");
        Student ten = new Student("ten", "ten","seven");
        Student eleven = new Student("eleven", "eleven", "eight");
        Student twelve = new Student("twelve", "twelve", "nine");
        Student thirteen = new Student("thirteen", "thirteen", "ten");
        School yes = new School("fourteen", "red", "eleven");

        yes.addStudent(four);
        yes.addStudent(five);
        yes.addStudent(six);
        yes.addStudent(seven);
        yes.addStudent(eight);
        yes.addStudent(nine);
        yes.addStudent(ten);
        yes.addStudent(eleven);
        yes.addStudent(twelve);
        yes.addStudent(thirteen);

        yes.addTeacher(one);
        yes.addTeacher(two);
        yes.addTeacher(three);

        System.out.println(yes);

        yes.removeStudent(six);
        yes.removeStudent(ten);

        yes.removeTeacher(two);

        System.out.println(yes);

        yes.removeCourse("French");
        yes.addCourse("Spanish");

        System.out.println(yes.courses);
    }
}
