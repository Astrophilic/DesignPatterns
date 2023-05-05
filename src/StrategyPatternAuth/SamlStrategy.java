package StrategyPatternAuth;

public class SamlStrategy implements AuthStrategy{


    final String samlId;
    final String password;

    public SamlStrategy(String samlId, String password) {
        this.samlId = samlId;
        this.password = password;
    }

    public String getSamlId() {
        return samlId;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void authenticate() {
        System.out.println("authenticated using saml");
    }
}
