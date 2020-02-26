package com.example.contact.Controller;

import java.util.List;
import java.util.Map;

//import com.example.contact.Dao.ContactRepository;
import com.example.contact.contacts.contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class coreController{

    @RequestMapping("/hello")
    public String home(){

        return "hello";
    }
    @RequestMapping("/index")
    public String index(){

        return "index";
    }
    @RequestMapping("/file")
    public String file(){

        return "file";
    }
    @RequestMapping("/fabricnetwork")
    public String fabricnetwork(){
        return "fabricnetwork";

    }
}
