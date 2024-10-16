package BasicDemo;

import java.util.Scanner;

public class ClassroomAttendanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students present: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        String[] students = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }

        while (true) {
            System.out.println("Choose an option:\n(1) Check attendance\n(2) Add a new student\n(3) List existing students");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the student's name to check attendance: ");
                    String studentName = scanner.nextLine();
                    boolean isPresent = isStudentPresent(students, studentName);
                    System.out.println(studentName + (isPresent ? " attended the class." : " did not attend the class."));
                    break;
                case 2:
                    System.out.print("Enter the name of the new student to add: ");
                    String newStudent = scanner.nextLine();
                    students = addStudent(students, newStudent);
                    System.out.println(newStudent + " has been added to the attendance list.");
                    break;
                case 3:
                    System.out.println("Existing students:");
                    for (String student : students) {
                        System.out.println(student);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            if (scanner.nextLine().equalsIgnoreCase("no")) {
                break;
            }
        }
        scanner.close();
    }

    private static boolean isStudentPresent(String[] students, String name) {
        for (String student : students) {
            if (student.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    private static String[] addStudent(String[] students, String newStudent) {
        String[] updatedStudents = new String[students.length + 1];
        System.arraycopy(students, 0, updatedStudents, 0, students.length);
        updatedStudents[students.length] = newStudent;
        return updatedStudents;
    }
}
