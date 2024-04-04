package lv.venta.seminaars_5.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hello")
        public String getMethodName(){
        System.out.println("Hello");
        return "hello-page";
        }

}
