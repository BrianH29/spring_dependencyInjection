package com.bh.DI.Argument;

import com.bh.DI.Argument.Argument;
import com.bh.DI.Argument.ArgumentResolver;
import com.bh.DI.Argument.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Frontend {

    @Autowired
    ArgumentResolver argumentResolver;

    @Autowired
    Calculator calculator;

    public void run(){
        System.out.println("Enter 2 numbers like 'a b' : ");
        Argument argument = argumentResolver.resolve(System.in);
        int result  = calculator.calc(argument.getA(), argument.getB());
        System.out.println("result = " + result);
    }
}
