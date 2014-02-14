package com.batey.examples.testing.spock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleWebAppController {

    @RequestMapping("/exampleendpoint")
    public @ResponseBody Payload exampleEndpoint(@RequestParam(value="input") String input) {
        return new Payload("Something really important: " + input);
    }
}