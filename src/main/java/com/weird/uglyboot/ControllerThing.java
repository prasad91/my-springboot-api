package com.weird.uglyboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerThing {

    @RequestMapping("/doThings")
    public String xyz(@RequestParam(required = false) String abc) {
        if (abc == null)
            return "nope";
        else
            return "ya " + abc;
    }
}
