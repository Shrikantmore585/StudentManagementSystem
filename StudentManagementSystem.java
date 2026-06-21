import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagementSystem {
    static ArrayList<Student> students = new ArrayList<>();

    public static void addstudent(Scanner sc) {
        System.out.print("enter student name: ");
        String name = sc.nextLine();
        System.out.print("enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("enter grade: ");
        String grade = sc.nextLine();
        Student s = new Student(name, roll, grade);
        students.add(s);
        System.out.println("student added successfully...");
    }

    public static void removestudent(Scanner sc) {
        System.out.print("enter roll number of the student to remove: ");
        int roll = sc.nextInt();
        boolean found = false;
        for (Student s : students) {
            if (s.rollNo == roll) {
                students.remove(s);
                found = true;
                System.out.println("student removed");
                break;
            }
        }
        if (!found) {
            System.out.println("student not found");
        }
    }

    public static void searchstudent(Scanner sc) {
        System.out.print("enter roll number to search: ");
        int roll = sc.nextInt();
        for (Student s : students) {
            if (s.rollNo == roll) {
                s.displayStudent();
                return;
            }
        }
        System.out.println("student not found");
    }

    public static void displaystudents() {
        if (students.isEmpty()) {
            System.out.println("students not available");
            return;
        }
        for (Student s : students) {
            s.displayStudent();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n**** Student Management System ****");
            System.out.println("1. add Student");
            System.out.println("2. remove Student");
            System.out.println("3. search Student");
            System.out.println("4. display All Students");
            System.out.println("5. exit");
            System.out.print("enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addstudent(sc);
                    break;
                case 2:
                    removestudent(sc);
                    break;
                case 3:
                    searchstudent(sc);
                    break;
                case 4:
                    displaystudents();
                    break;
                case 5:
                    System.out.println("exiting program...");
                    break;
                default:
                    System.out.println("invalid choice");
            }
        } while (choice != 5);
        sc.close();
    }
}