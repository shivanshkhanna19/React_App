package net.engineeringdigest.journalApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("ABC") //End point
    public String Hello()
    {
        String a = "Heloo Call returned";
        return a;
    }

    //@Autowired
    private JournalApplication.DIC dic;  //Field Injection

    @GetMapping("/Dog")
    public String Dog()
    {

        return JournalApplication.DIC.Getname();
    }


}
