package cn.tycoding.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 *
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    
    /*@Value(value = "${user.name}")
    private String userName;
    
    @Value(value = "${user.age}")
    private String userAge;*/

    @RequestMapping("/list")
    public ModelAndView itemList() {
        List<String> list = new ArrayList<>();
        list.add("list-one");
        list.add("list-two");
        list.add("list-three");
        list.add("list-four");
        list.add("list-five2");
        ModelAndView modelAndView = new ModelAndView("thymeleaf/demo01");
        modelAndView.addObject("list", list);
        System.out.println("i am a girl");
        return modelAndView;
    }

}
