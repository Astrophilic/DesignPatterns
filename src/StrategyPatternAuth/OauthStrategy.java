package StrategyPatternAuth;

public class OauthStrategy implements AuthStrategy{

    private final String email;
    private final String password;

    public OauthStrategy(String mail, String number) {
        this.email = mail;
        this.password = number;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }



    @Override
    public void authenticate() {
        System.out.println("authenticated using oauth strategy");
    }
}
