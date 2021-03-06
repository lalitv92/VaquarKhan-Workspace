package info.rnowak.springFun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/home")
    @ResponseBody
    public String home() {
        return "Hello world from Spring Boot!";
    }

    @RequestMapping("/say/{what}")
    @ResponseBody
    public String say(@PathVariable String what) {
        return what;
    }
}
