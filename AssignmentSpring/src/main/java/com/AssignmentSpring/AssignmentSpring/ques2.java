package com.AssignmentSpring.AssignmentSpring;
class A
{
    void show()
    {
        System.out.println("Welcome to the TTN");
    }
}
class B extends A
{
    void foo()
    {
        System.out.println("Hello TTN");
    }
}

public class ques2
{
    public static void main(String args[])
    {
        B sc= new B();
        sc.foo();
    }
}