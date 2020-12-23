package com.syntax.class1;

import org.testng.annotations.Test;

public class Task1 {
//    Task 1: Executing tests using @Test
//    Create three tests with unique @test methods names.
//    Execute all test methods

    @Test
    public void hello(){
        System.out.println("Hello");
    }

    @Test
    public void syntax(){
        System.out.println("Syntax");
    }

    @Test
    public void classmates(){
        System.out.println("Classmates");
    }
}
