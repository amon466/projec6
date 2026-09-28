package o_exercise6;

import java.util.Date;
import java.util.Scanner;

public class OfflineCourse extends Course {

    private String classroomNumber;
    private double materialFeePerStudent;

    public OfflineCourse(String classroomNumber, double materialFeePerStudent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
        this.classroomNumber = classroomNumber;
        this.materialFeePerStudent = materialFeePerStudent;
    }

    public OfflineCourse() {
    }

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public double getMaterialFeePerStudent() {
        return materialFeePerStudent;
    }

    public void setMaterialFeePerStudent(double materialFeePerStudent) {
        this.materialFeePerStudent = materialFeePerStudent;
    }
    Scanner Scanner = new Scanner(System.in);

    @Override
    public void addCourse() {
        super.addCourse();
        System.out.println("enter ClassroomNumber");
        setClassroomNumber(Scanner.nextLine());
        System.out.println("enter MaterialFeePerStudent");
        setMaterialFeePerStudent(Scanner.nextDouble());
        Scanner.nextLine();
    }

    @Override
    public void updateCourse() {
        super.updateCourse();
        System.out.println("enter ClassroomNumber");
        setClassroomNumber(Scanner.nextLine());
        System.out.println("enter MaterialFeePerStudent");
        setMaterialFeePerStudent(Scanner.nextDouble());
        Scanner.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("ClassroomNumber" + getClassroomNumber());
        System.out.println("MaterialFeePerStudent" + getMaterialFeePerStudent());
    }

    @Override
    public double calculateTotalFee() {
        return (getFeePerStudent() +getMaterialFeePerStudent())*getEnrolledStudents();
    }
}
