
import java.util.ArrayList;
import java.util.Scanner;

public class TuitionCenter{
    Address address;
    Name headmaster;
    ArrayList<Tutor> tutors = new ArrayList<>(3);

    // SETTER, GETTER
    public void setAddress(Address theaddress){
        this.address = theaddress;
    }
    public Address getAddress(){
        return address;
    }
    public void setHeadmaster(Name thename){
        this.headmaster = thename;
    }
    public Name getHeadmaster(){
        return headmaster;
    }

    // METHODS/OPERATIONS
    public void enterTuitionCenterDetails(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------Please enter Tuition Center's Address--------");
        System.out.print("Enter Unit No: ");
        String unitNum = scanner.nextLine();
        System.out.print("Enter Street Name: ");
        String street = scanner.nextLine();
        System.out.print("Enter Postcode: ");
        String postcode = scanner.nextLine();
        System.out.print("Enter District: ");
        String district = scanner.nextLine();
        System.out.print("Enter State: ");
        String state = scanner.nextLine();

        System.out.println("--------Please enter Tuition Center's Headmaster--------");
        System.out.print("Enter Headmaster's First Name: ");
        String fname = scanner.nextLine();
        System.out.print("Enter Headmaster's Middle Name: ");
        String mname = scanner.nextLine();
        System.out.print("Enter Headmaster's Last Name: ");
        String lname = scanner.nextLine();

        TuitionCenter tuition = new TuitionCenter();
        Address tuitionAddress = new Address(unitNum,street,postcode,district,state);
        Name tuitionHeadmaster = new Name(fname,mname,lname);
        tuition.setAddress(tuitionAddress);
        tuition.setHeadmaster(tuitionHeadmaster);

        System.out.println("\n----------------Tuition Center's Details----------------");
        System.out.println("Tuition Center Address: " + tuition.getAddress().getUnitNum() + ", " + tuition.getAddress().getStreet()
                + ", " + tuition.getAddress().getPostcode() + " " + tuition.getAddress().getDistrict() + ", " + tuition.getAddress().getState());
        System.out.println("Tuition Center HeadMaster: " + tuition.getHeadmaster().getFName() + " " + tuition.getHeadmaster().getMName()
                + " " + tuition.getHeadmaster().getLName());
        System.out.println("----------------------------------------------------------\n");
    }

    public void addTutor(Tutor tutors){
        Tutor tutor = new Tutor();
        tutor.enterTutorDetails();
        this.tutors.add(tutors);
    }
    public int getTotalTutors(){
        return tutors.size();
    }
}
