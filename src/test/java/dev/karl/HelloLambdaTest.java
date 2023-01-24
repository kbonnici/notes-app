package dev.karl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloLambdaTest {

    @Test
    public void shouldReturnHelloMessage() {
        HelloLambda sut = new HelloLambda();
        assertEquals("Hello, AWS Lambda!", sut.handleLambdaRequest());
    }

    @Test
    void helloNameHandler() {
        HelloLambda sut = new HelloLambda();
        assertEquals("Hello, Karl!", sut.helloNameHandler("Karl"));
    }
}