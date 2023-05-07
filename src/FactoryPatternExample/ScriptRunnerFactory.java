package FactoryPatternExample;

import java.util.HashMap;
import java.util.Map;

public class ScriptRunnerFactory {
    static Map<String,ScriptRunner> runnerMap= new HashMap<>();

    static {
        runnerMap.put("python", new PythonScriptRunner());
        runnerMap.put("bash", new BashRunner());
        runnerMap.put("cpp", new CppRunner());
    }

    public static ScriptRunner getScriptRunnerForLanguage(final String language){
        switch (language){
            case "python":
                return runnerMap.get("python");
            case "java":
                return runnerMap.get("java");
            case "cpp":
                 return runnerMap.get("cpp");
            default:
                throw new IllegalStateException("Unexpected value: " + language);
        }
    }
}
