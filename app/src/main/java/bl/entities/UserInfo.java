package bl.entities;

/**
 * Created by Daniel_m on 25/03/2017.
 */

public class UserInfo {
    private String name;
    private int age;
    private String country;
    private String city;
    private boolean isAnonymous = true;

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", isAnonymous=" + isAnonymous +
                '}';
    }

    public UserInfo(String name, int age, String country, String city) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.city = city;
        this.isAnonymous = false;
    }

    public UserInfo(String country){
        this.country = country;
        this.isAnonymous = true;
    }

    public UserInfo(){
    }

    public boolean isAnonymous() {
        return isAnonymous;
    }

    public void setAnonymous(boolean anonymous) {
        isAnonymous = anonymous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

