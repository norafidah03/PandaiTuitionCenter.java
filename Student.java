import java.util.Scanner;

//arrays in Java are always dynamic!
public class Student {                  // class for one student
    // DATA/ATTRIBUTES                  // these are at the lower level
    Name name;
    String IC;
    Address address;
    String year;
    String schoolName;
    private float[] scores = new float[5];

    // OPERATIONS - SETTER, GETTER, OTHER METHODS
    public void setName(Name thename){
        name = thename;
    }
    public Name getName(){
        return name;
    }
    public void setAddress(Address theaddress){
        address = theaddress;
    }
    public Address getAddress(){
        return address;
    }

    public void enterStudentDetails(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------Please enter Student's Details--------");
        System.out.print("Enter Student's First Name: ");
        String fname = scanner.nextLine();
        System.out.print("Enter Student's Middle Name: ");
        String mname = scanner.nextLine();
        System.out.print("Enter Student's Last Name: ");
        String lname = scanner.nextLine();

        System.out.print("Enter Student's IC: ");
        this.IC = scanner.nextLine();
        System.out.println("\nEnter Student's Address: ");
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

        System.out.print("\nEnter Student's Year: ");
        this.year = scanner.nextLine();
        System.out.print("Enter Student's School Name: ");
        this.schoolName = scanner.nextLine();

        Student student = new Student();
        Address studentAddress = new Address(unitNum,street,postcode,district,state);
        Name name = new Name(fname,mname,lname);
        student.setAddress(studentAddress);
        student.setName(name);

        System.out.println("\n----------------Student's Details----------------");
        System.out.println("Student's Name: " + student.getName().getFName() + " " + student.getName().getMName()
                + " " + student.getName().getLName());
        System.out.println("Student's IC: " + this.IC);
        System.out.println("Student's Address: " + student.getAddress().getUnitNum() + ", " + student.getAddress().getStreet()
                + ", " + student.getAddress().getPostcode() + " " + student.getAddress().getDistrict() + ", " + student.getAddress().getState());
        System.out.println("Year: " + this.year);
        System.out.println("School Name: " + this.schoolName);
        System.out.println("\n----------------------------------------------------------\n");
    }

    public float[] enterStudentScores() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Scores #" + (i + 1) + ": ");
            scores[i] = scanner.nextFloat();
            System.out.print("\n");
        }
        return scores;
    }

    public void setStudentScores(float[] scores){
        this.scores = scores;
    }

    public float calcAvg(){
        float sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        float avg = sum / scores.length;
        return avg;
    }

    public float getMinScores() {
        float min = 100;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }

    public float getMaxScores(){
        float max = 0;
        for (int i = 0; i < scores.length; i++){
            if (scores[i] > max){
                max = scores[i];
            }
        }
        return max;
    }
}
