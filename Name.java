
public class Name{

    private String firstName;
    private String middleName;
    private String lastName;

    // CONSTRUCTOR (name same as className, no return type)
    public Name(String firstName, String middleName, String lastName){
        this.firstName = firstName;             //this. --> current object (referring to the global class attributes)
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // GETTER
    public String getFName(){
        return firstName;
    }

    public String getMName(){
        return middleName;
    }

    public String getLName(){
        return lastName;
    }
}
