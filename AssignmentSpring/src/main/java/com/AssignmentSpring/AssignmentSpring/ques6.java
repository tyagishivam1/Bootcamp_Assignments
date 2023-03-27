package com.AssignmentSpring.AssignmentSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

interface myInterface3{
    void showMarks();
}
@Component
class Student5 implements myInterface2{

    @Override
    public void showMarks() {
        System.out.println("Student1 passed");
    }
}
@Component
@Primary
class Student6 implements myInterface2{
    @Override
    public void showMarks() {
        System.out.println("Student2 Failed");
    }
}

@Component
class Result2{
    private myInterface2 obj;
    @Autowired
    public Result2(myInterface2 obj) {
        this.obj = obj;
    }

    public void display(){
        obj.showMarks();
    }
}
@SpringBootApplication
public class ques6 {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ques6.class);
        Result1 res = context.getBean(Result1.class);
        res.display();
        System.out.println(res);
    }
}

