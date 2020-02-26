package com.example.contact.Controller;

import com.example.contact.contacts.contact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller

public class homeController {
    //@RequestMapping(method= RequestMethod.GET) //处理GET“/”
    @RequestMapping("/")
    public String home(){

        return "hello";
    }
}
