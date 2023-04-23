package com.example.dependency_Injection.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    String myComponentName;

    public MyComponent (){
        this.myComponentName = "Stella";
    }

    public String getMyComponentName() {
        return myComponentName;
    }
}
