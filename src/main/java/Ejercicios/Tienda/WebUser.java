package Ejercicios.Tienda;

public class WebUser {
    private String login_id;
    private String password;
    private UserState state;
    private Customer customer;

    public WebUser(String id, String password) {
        this.login_id = id;
        this.password = password;
        this.state = UserState.NEW;
    }

    public void activate() {
        if (state == UserState.NEW) {
            state = UserState.ACTIVE;
        }
    }
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public String getLogin_id() {
        return login_id;
    }
    public WebUser setLogin_id(String login_id) {
        this.login_id = login_id;
        return this;
    }
    public String getPassword() {
        return password;
    }
    public WebUser setPassword(String password) {
        this.password = password;
        return this;
    }
    public UserState getState() {
        return state;
    }
    public WebUser setState(UserState state) {
        this.state = state;
        return this;
    }
}
