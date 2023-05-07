package FactoryPatternExample;

public class ScriptRunnerService {
    private ScriptRunner scriptRunner;
    public ScriptRunnerService(final String language) {


        this.scriptRunner = ScriptRunnerFactory.getScriptRunnerForLanguage(language);
    }

    public void executeScript(){
        this.scriptRunner.runScript();
    }
}
