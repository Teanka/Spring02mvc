package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserAgentController {

    @GetMapping("/useragent")
    @ResponseBody
    public String userAgent(@RequestHeader("user-agent") String userAgent) {
        return "user-agent = "  + userAgent;
    }
}
