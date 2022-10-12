package lambdaExpression;

// Function class 를 사용하기 위한 address class
public class Address {
    private String country;
    private String city;

    public Address(String country, String city){
        this.country = country;
        this.city = city;
    }

    public String getCountry(){
        return country;
    }

    public String getCity(){
        return city;
    }
}
