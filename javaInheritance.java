public class javaInheritance {
    public static void main(String[] args) {
        Student student = new Student("Arthur", 20);
        student.displayInfo();

        GraduateStudent gradStudent = new GraduateStudent("Bob", 25, "Software Engineer");
        gradStudent.displayInfo();
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class GraduateStudent extends Student {
    String jobTitle;

    public GraduateStudent(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Job : " + jobTitle);
    }
}
