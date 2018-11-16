package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class SessionController {
    @RequestMapping(path = "/session", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String session(HttpSession session){
        String sessionAttribute = (String) session.getAttribute("loginStart");
        if(sessionAttribute==null){
            session.setAttribute("loginStart", LocalDateTime.now().toString());
            return "Ustawiłam sesję";
        }

        return sessionAttribute;
    }
}
