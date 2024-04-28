public class User {

    private String email;
    private String phoneNumber;
    private String userID;

    public User(String email, String phoneNumber, String userID) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUserID() {
        return userID;
    }

}