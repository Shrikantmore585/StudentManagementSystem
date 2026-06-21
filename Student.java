class Student {
    String name;
    int rollNo;
    String grade;
    Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }
    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Grade: " + grade);
        System.out.println("************************");
    }
}