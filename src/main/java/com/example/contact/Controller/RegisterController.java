package com.example.contact.Controller;

import com.example.contact.Dao.UserRepository;
import com.example.contact.entity.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Objects;

@Controller
public class RegisterController {
    @GetMapping("/register")
    public ModelAndView login(ModelAndView modelAndView){
        modelAndView.setViewName("register");
        return modelAndView;
    }

    //private static final Logger log = LoggerFactory.getLogger(RegisterController.class);

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ModelAndView login(ModelAndView modelAndView, @Valid UserVo userVo, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            modelAndView.addObject("error", Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage());
            modelAndView.setViewName("register");
            return modelAndView;
        }
        String userName = userVo.getUserName();
        String password = userVo.getPassword();
        UserVo user=new UserVo();
        user.setUserName(userName);
        user.setPassword(password);
        userRepository.save(user);
        modelAndView.addObject("message","注册成功，欢迎使用！");
        modelAndView.addObject("userName",userName);

        modelAndView.setViewName("hello");
        return modelAndView;
    }

}
