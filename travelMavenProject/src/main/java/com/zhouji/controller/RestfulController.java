package com.zhouji.controller;

import com.zhouji.dao.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/user")
public class RestfulController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    @ResponseBody
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    /**
     * Spring MVC RESTful JSON
     **/
    @RequestMapping(value = "/view/{username}", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<String> view(@PathVariable String username) {

        System.out.println("view username:" + username);

        ArrayList<String> strArray = new ArrayList<String>();
        strArray.add(username);

        return strArray;
    }

}
