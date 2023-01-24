package dev.karl;

public class HelloLambda {
    public String handleLambdaRequest() {
        return "Hello, AWS Lambda!";
    }

    public String helloNameHandler(String name){
        return "Hello, " + name + "!";
    }
}
