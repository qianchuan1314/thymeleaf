package com.offcn.controller;

import com.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Controller
public class ThymeleafController {
    @GetMapping("/indexPage")
    public String indexPage(Model model){
       model.addAttribute("message","hello-ripe-thymeleaf");

        System.out.println("==============进入了thymeleaf");
        User user = new User();
        user.setAge(22);
        user.setId(2);
        user.setName("LISA");
        model.addAttribute("user",user);
        HashMap<Object, Object> map = new HashMap();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        model.addAttribute("src",map);
        User user2 = new User();
        user2.setAge(33);
        user2.setId(3);
        user2.setName("RIPE");
        User user3 = new User();
        user3.setAge(11);
        user3.setId(1);
        user3.setName("TOM");

        ArrayList<User>  users= new ArrayList();
        users.add(user);
        users.add(user2);
        users.add(user3);
        model.addAttribute("users",users);

     Date date = new Date();
     model.addAttribute("date",date);
     double num=3.1415926;
     model.addAttribute("price",num);
     String str="dkjsfkjskjflkdfjkdjfk"+"可能释放了空间看到";
     model.addAttribute("str",str);


     return "/index";
    }

}
