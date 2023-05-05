package StrategyPatternAuth;

public class AuthContext {
    private AuthStrategy authStrategy;

    public void setAuthStrategy(AuthStrategy authStrategy) {
        this.authStrategy = authStrategy;
    }

    public AuthContext(AuthStrategy authStrategy) {
        this.authStrategy = authStrategy;
    }

    public void authenticateUser(){
        this.authStrategy.authenticate();
    }
}
