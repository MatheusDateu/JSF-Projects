package bean;

public class UserBean {
    private String uName;
    private String uPassword;

    public String getuName() {
        return uName;
    }

    public void setuName(String newValue) {
        uName = newValue;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String newValue) {
        uPassword = newValue;
    }
}
