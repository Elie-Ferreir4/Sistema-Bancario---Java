package User.Account;

public class User {
    private String userName;
    private String userAgency;


    public User (String name, String agency) {
        setNameUser(name);
        setAgency(agency);
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAgency() {
        return userAgency;
    }

    private void setNameUser (String name) {
        userName = name;
    }

    private void setAgency (String agency) {
        userAgency = agency;
    }

    @Override
    public String toString() {
        return "Usuario: " + userName + " Agencia: " + userAgency;
    }
}
