package context;

import business.CucumberJar;

public class TestContext {

    private CucumberJar cucumberJar = new CucumberJar();

    public CucumberJar getCucumberJar(){
        return cucumberJar;
    }
}
