package o_exercise6;

import java.util.Date;
import java.util.Scanner;

public class OnlineCourse extends Course {

    private String platformName;
    private double discountPercent;

    public OnlineCourse(String platformName, double discountPercent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
        this.platformName = platformName;
        this.discountPercent = discountPercent;
    }

    public OnlineCourse() {
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    Scanner Scanner = new Scanner(System.in);

    @Override
    public void addCourse() {
        super.addCourse();
        System.out.println("enter platformName");
        setPlatformName(Scanner.nextLine());
        System.out.println("enter discountPercent");
        setDiscountPercent(Scanner.nextDouble());
    }

    @Override
    public void updateCourse() {
        super.updateCourse();
        System.out.println("enter platformName");
        setPlatformName(Scanner.nextLine());
        System.out.println("enter discountPercent");
        setDiscountPercent(Scanner.nextDouble());
        Scanner.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("platformName" + getPlatformName());
        System.out.println("discountPercent" + getDiscountPercent());
    }

    @Override
    public double calculateTotalFee() {
        return getFeePerStudent() * getEnrolledStudents() * (1 - getDiscountPercent() / 100);
    }

}
