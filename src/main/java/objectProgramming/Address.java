package objectProgramming;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Address {

    private  String street;
    private int homeNo;
    private int flatNo;
    private String city;

    public Address(String street, int homeNo, int flatNo, String city) {
        this.street = street;
        this.homeNo = homeNo;
        this.flatNo = flatNo;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address " + street + " " + homeNo + "/" + flatNo + " " + city ;
    }
}
