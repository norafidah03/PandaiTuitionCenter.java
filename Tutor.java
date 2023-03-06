import java.util.ArrayList;
import java.util.Scanner;

public class Tutor{
    // DATA//ATTRIBUTES
    Name name;
    String IC;
    Address address;
    String qualification;
    int numYearsExp;
    String dateJoined;
    int numYearsinCenter;
    ArrayList<Student> students = new ArrayList<>(2);

    // OPERATION - SETTER, GETTER, METHODS
    public void setName(Name thename){
        name = thename;
    }
    public Name getName(){
        return name;
    }
    public void setAddress(Address theaddress){
        this.address = theaddress;
    }
    public Address getAddress(){
        return address;
    }

    public void enterTutorDetails(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------Please enter Tutor's Details--------");
        System.out.print("Enter Tutor's First Name: ");
        String fname = scanner.nextLine();
        System.out.print("Enter Tutor's Middle Name: ");
        String mname = scanner.nextLine();
        System.out.print("Enter Tutor's Last Name: ");
        String lname = scanner.nextLine();

        System.out.print("Enter Tutor's IC: ");
        this.IC = scanner.nextLine();
        System.out.println("\nEnter Tutor's Address: ");
        System.out.print("Unit No: ");
        String unitNum = scanner.nextLine();
        System.out.print("Street: ");
        String street = scanner.nextLine();
        System.out.print("Postcode: ");
        String postcode = scanner.nextLine();
        System.out.print("District: ");
        String district = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();

        System.out.print("\nEnter Tutor's Qualification: ");
        this.qualification = scanner.nextLine();
        System.out.print("Enter Tutor's Date Joined: ");
        this.dateJoined = scanner.nextLine();
        System.out.print("Enter Tutor's Total Years in Tuition Center: ");
        this.numYearsinCenter = scanner.nextInt();
        System.out.print("Enter Tutor's Total Years of Experience: ");
        this.numYearsExp = scanner.nextInt();

        Tutor tutor = new Tutor();
        Address tutorAddress = new Address(unitNum,street,postcode,district,state);
        Name name = new Name(fname,mname,lname);
        tutor.setAddress(tutorAddress);
        tutor.setName(name);

        System.out.println("\n----------------Tutor's Background----------------");
        System.out.println("Tutor's Name: " + tutor.getName().getFName() + " " + tutor.getName().getMName()
                + " " + tutor.getName().getLName());
        System.out.println("Tutor's IC: " + this.IC);
        System.out.println("Tutor's Address: " + tutor.getAddress().getUnitNum() + ", " + tutor.getAddress().getStreet()
                + ", " + tutor.getAddress().getPostcode() + " " + tutor.getAddress().getDistrict() + ", " + tutor.getAddress().getState());
        System.out.println("Tutor's Qualification: " + this.qualification);
        System.out.println("Tutor's Years of Experience: " + numYearsExp);
        System.out.println("Date Joined the Tuition Center: " + dateJoined);
        System.out.println("Number of Years in the Tuition Center: " + numYearsinCenter);
        System.out.println("----------------------------------------------------------\n");
    }

    public void addStudent(Student students){
        Student student = new Student();
        student.enterStudentDetails();
        this.students.add(students);
    }

    public int getTotalStudents(){
        return students.size();
    }
}
