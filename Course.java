package o_exercise6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public abstract class Course implements ICourse {
    
    private String id;
    private double feePerStudent;
    private Date startDate;
    private boolean isAvailable;
    private int enrolledStudents;
    
    public Course() {
    }
    
    public Course(String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        this.id = id;
        this.feePerStudent = feePerStudent;
        this.startDate = startDate;
        this.isAvailable = isAvailable;
        this.enrolledStudents = enrolledStudents;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public double getFeePerStudent() {
        return feePerStudent;
    }
    
    public void setFeePerStudent(double feePerStudent) {
        this.feePerStudent = feePerStudent;
    }
    
    public Date getStartDate() {
        return startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public boolean isIsAvailable() {
        return isAvailable;
    }
    
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    public int getEnrolledStudents() {
        return enrolledStudents;
    }
    
    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
    public boolean isAvailable(){
         return isAvailable;
    }
    Scanner Scanner = new Scanner(System.in);
    
    @Override
    public void addCourse() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("enter id ");
            setId(Scanner.nextLine());
            System.out.println("enter feePerStudent");
            setFeePerStudent(Scanner.nextDouble());
            Scanner.nextLine();
            System.out.println("enter start date");
            setStartDate(sdf.parse(Scanner.nextLine()));
            System.out.println("true/false");
            setIsAvailable(Boolean.parseBoolean(Scanner.nextLine()));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        System.out.println("enter enrolledStudents ");
        setEnrolledStudents(Scanner.nextInt());
        Scanner.nextLine();
    }
    
    @Override
    public void updateCourse() {
    try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            System.out.println("enter id ");
            setId(Scanner.nextLine());
            System.out.println("enter feePerStudent");
            setFeePerStudent(Scanner.nextDouble());
            Scanner.nextLine();
            System.out.println("enter start date");
            setStartDate(sdf.parse(Scanner.nextLine()));
            System.out.println("true/false");
            setIsAvailable(Boolean.parseBoolean(Scanner.nextLine()));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        System.out.println("enter enrolledStudents ");
        setEnrolledStudents(Scanner.nextInt());
        Scanner.nextLine();
        }
    
    @Override
    public void displayDetails() {
        System.out.println("id"+getId());
        System.out.println("feePerStudent"+getFeePerStudent());
        System.out.println("date"+getStartDate());
        System.out.println("enrolledStudents"+getEnrolledStudents());
        System.out.println("true.fale"+isAvailable);
    }
}
