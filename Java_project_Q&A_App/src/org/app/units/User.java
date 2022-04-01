package org.app.units;

public class User extends AbstractEntity {

    private String userName;

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String password;

    private UserRole userRole;

    @Override
    public void autoGenerateId() {
    }

    //Implementation of the abstract class defined in its parent
}
