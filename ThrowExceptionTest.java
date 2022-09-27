package org.example;

class InvalidAgeException extends Exception{

    InvalidAgeException (String s){
        super(s);
    }
}

public class ThrowExceptionTest {
    public static void main(String[] args) {
        try {
            int age = 17;
            if (age < 18) {
                throw new InvalidAgeException("Age is invalid");
            }
        }
        catch (Exception e){
            System.out.println("Inside catch");
            System.out.println(e);
        }
    }
}