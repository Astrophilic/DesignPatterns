package FactoryPatternExample;

public class BashRunner implements ScriptRunner{
    @Override
    public void runScript() {
        System.out.println("running bash script");
    }
}
