package com.exercise.lesson.controller;

import org.springframework.web.bind.annotation.*;

/*@RestController
@RequestMapping(path = "/first")//localhost8080/first/hello şeklinde artık helloya erişilir
// request mapping class seviyesinde kullanılır*/
public class HelloController {

    /*
    //@RequestMapping(path="/hello", method = RequestMethod.GET)
    @GetMapping(path = "/hello")//yukarıdaki ile aynı işi yapar
    public String sayHello(){
        return "Hello world";
    }*/

    /*@GetMapping({"/message1", "/message1/{message}"})
    public String getMyMessageWithVariable(@PathVariable(name = "message", required = false) String message) {
        return "Your message is : " + message;//path variable ile istenilen parametreleri döndürür
    }

    @GetMapping("/message2")
    public String getMyMessageWithParam(@RequestParam(name = "message", required = false, defaultValue = "my message default") String message) {
        return "Your message is : " + message;//sorgu yapılan parametreleri döndürür
    }*/


}
