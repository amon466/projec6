package o_exercise6;

import java.util.ArrayList;

public class CourseArrayList {

    private ArrayList <Course> courses = new ArrayList<>();

    public void addCourseToArrayList(Course course) {
        courses.add(course);
        System.out.println("Course added successfully.");
    }
    public void updateCourseById(String id) {
        boolean found = false;

        for (Course course : courses) {
            if (course.getId().equals(id)) {
                System.out.println("Course found. Enter new details:");
                course.updateCourse();
                System.out.println("Course updated successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Course with ID " + id + " not found.");
        }
    }
    public void deleteCourseById(String id) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId().equals(id)) {
                courses.remove(i);
                System.out.println("Course deleted successfully.");
                return;
            }
        }
        System.out.println("Course with ID " + id + " not found.");
    }

    public void displayAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses in the list.");
            return;
        }
        for (Course course : courses) {
            course.displayDetails();
            System.out.println("------------------------");
        }
    }
    public void displayAvailableCourses() {
        boolean hasAvailable = false;
        for (Course course : courses) {
            if (course.isAvailable()) {
                course.displayDetails();
                System.out.println("------------------------");
                hasAvailable = true;
            }
        }
        if (!hasAvailable) {
            System.out.println("No available courses at the moment.");
        }
    }
    public double calculateTotalFees() {
        double total = 0;
        for (Course course : courses) {
            total += course.calculateTotalFee();
        }
        return total;
    }
}