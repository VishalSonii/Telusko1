package org.example;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
    public void Drive(){
        System.out.println("Car chal rhi h ");
    }
}

