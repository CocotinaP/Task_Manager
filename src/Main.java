import test.Tests;

public class Main {
    public static void main(String[] args) {
        Tests tests = Tests.getInstance();
        tests.testEx4();
        tests.testEx10(args[0]);
        tests.testEx13(args[0]);
        tests.testEx14(args[0]);
    }
}