package ru.lubich.talkushka;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("/sweater")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "sweater";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", "Hello me!!!");
        return "main";
    }

}