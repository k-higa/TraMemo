package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kazuyukihiga on 2016/12/17.
 */
@Controller
public class ElementController {

    @RequestMapping(value = "/elements", method = RequestMethod.GET)
    public String get() {
        return "elements";
    }

}
