package User_UmL;

public class User {

    private int userId;
    private int age;
    private String emailAdrress;
    private String home;
    private String name;
    private int password;
    private int phoneNumber;

//    public User(int userId, int age, String emailAdrress, String home, String name, int password, int phoneNumber) {
//        this.userId = userId;
//        this.age = age;
//        this.emailAdrress = emailAdrress;
//        this.home = home;
//        this.name = name;
//        this.password = password;
//        this.phoneNumber = phoneNumber;
//    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAdrress() {
        return emailAdrress;
    }

    public void setEmailAdrress(String emailAdrress) {
        this.emailAdrress = emailAdrress;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
