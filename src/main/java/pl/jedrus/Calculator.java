package pl.jedrus;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {

    public static void main(String[] args) {
        divide(5.0, 0);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double substract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static boolean compare(double a, double b) {
        return a == b;
    }

    public int eval(String s) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        return (int) engine.eval(s);
    }
}
