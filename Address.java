
public class Address {
    private String unitNum;
    private String street;
    private String postcode;
    private String district;
    private String state;

    // CONSTRUCTOR
    public Address(String unitNum, String street, String postcode,String district, String state){
        this.unitNum = unitNum;
        this.street = street;
        this.postcode = postcode;
        this.district = district;
        this.state = state;
    }

    // GETTER
    public String getUnitNum(){
        return unitNum;
    }
    public String getStreet(){
        return street;
    }
    public String getPostcode(){
        return postcode;
    }
    public String getDistrict(){
        return district;
    }
    public String getState(){
        return state;
    }
}
