package by.gstu.project.cli;

import by.gstu.project.App;

public class CliApp {
    public static void main(String[] args) {
        App app = new App();
        System.out.println("CLI Module: Calling core module...");
        System.out.println(app.sayHello());
    }
}