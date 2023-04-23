package com.example.dependency_Injection.service;

import com.example.dependency_Injection.component.MyComponent;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;

    public MyService(MyComponent myComponent){
        this.myComponent = myComponent;
    }

    public String getName(){
        return myComponent.getMyComponentName();
    }
}
