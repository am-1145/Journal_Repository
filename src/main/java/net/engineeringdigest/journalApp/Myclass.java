package net.engineeringdigest.journalApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myclass {

    @GetMapping("abc")
    public String sayHello(){
        return "Hello";
    }
}
