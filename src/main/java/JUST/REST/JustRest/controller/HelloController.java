package JUST.REST.JustRest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String world()
    {
        return "{\"result\" : \"hello\"}";
    }

}
