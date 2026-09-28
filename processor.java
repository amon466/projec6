package o_exercise6;

import java.util.Scanner;

public class processor {

    public static void main(String[] args) {
        CourseArrayList manager = new CourseArrayList();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n===== COURSE ENROLLMENT MANAGEMENT =====");
            System.out.println("1. Add a Course");
            System.out.println("2. Update a course by ID");
            System.out.println("3. Delete a course by ID");
            System.out.println("4. Display all courses");
            System.out.println("5. Display available courses");
            System.out.println("6. Calculate total fees");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice! Please enter a number from 1 to 7.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter 1 for Online Course, 2 for Offline Course: ");
                    int type = 0;
                    try {
                        type = Integer.parseInt(scanner.nextLine().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number!");
                        break;
                    }

                    if (type == 1) {
                        OnlineCourse oc = new OnlineCourse();
                        oc.addCourse();
                        manager.addCourseToArrayList(oc);
                    } else if (type == 2) {
                        OfflineCourse ofc = new OfflineCourse();
                        ofc.addCourse();
                        manager.addCourseToArrayList(ofc);
                    } else {
                        System.out.println("Invalid course type.");
                    }
                    break;
                case 2:
                    System.out.print("Enter Course ID to update: ");
                    String updateId = scanner.nextLine().trim();
                    manager.updateCourseById(updateId);
                    break;
                case 3:
                    System.out.print("Enter Course ID to delete: ");
                    String deleteId = scanner.nextLine().trim();
                    manager.deleteCourseById(deleteId);
                    break;
                case 4:
                    System.out.println("\n--- All Courses ---");
                    manager.displayAllCourses();
                    break;
                case 5:
                    System.out.println("\n--- Available Courses ---");
                    manager.displayAvailableCourses();
                    break;
                case 6:
                    double total = manager.calculateTotalFees();
                    System.out.println("Total fees for all courses: " + total);
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
