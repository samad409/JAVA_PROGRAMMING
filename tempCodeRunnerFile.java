class javaInheritance {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.displayInfo();

        GraduateStudent gradStudent = new GraduateStudent("Bob", 25, "AI in Healthcare");
        gradStudent.displayInfo();
    }
}