
public class Registration implements java.io.Serializable {

    private String firstName;
    private String lastName;
    private String phone;
    private String gender;
    private String idNumber;
    private String password;

    public Registration(String firstName, String lastName, String phone, String id, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.gender = gender;
        this.idNumber = id;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getIdNumber() {
        return idNumber;
    }
    
    
}
