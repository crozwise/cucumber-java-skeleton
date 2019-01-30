package io.cucumber.skeleton;

public class Belly {
    public void eat(int cukes) {
        String result = "eat function is running";
        System.out.println(cukes);
    }
    public void wait(int cukes) {
        String result = "wait function is running";
        System.out.println(cukes);
    }
    public String growl() {
        String result = "growl function is running";
        System.out.println(result);
        return result;
    }
    public String dummy() {
        String result = "dummy function is running";
        return result;
    }
}
