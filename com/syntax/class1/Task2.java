package com.syntax.class1;

import org.testng.annotations.*;

public class Task2 {

//    Task : Executing different test based TestNG annotations
//    Create class that will have:
//    Before and After Class annotation
//    Before and After Method annotation
//    2 methods with Test annotation

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }


    @Test
    public void test2(){
        System.out.println("test2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }

}
