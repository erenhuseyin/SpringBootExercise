package com.injectionlesson.injectiontypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    /*
    Injection Yöntemleri

        Field injection - autowired
        Setter injection
        Constructor injection
     */
    //field injection
    @Autowired
    private FirstClass firstClass;

    private SecondClass secondClass;

    //setter injection
    @Autowired
    public void setSecondClass(SecondClass secondClass) {
        this.secondClass = secondClass;
    }

    private ThirdClass thirdClass;

    //constructor injection
    public MyController(ThirdClass thirdClass) {
        this.thirdClass = thirdClass;
    }

    @GetMapping("/names")
    public String getNameOfClasses(){
        return this.firstClass.getName() + " - " +
                this.secondClass.getName();
    }
}
