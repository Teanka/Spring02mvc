package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalTime;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody// wtedy gdy nie przekazujemy do .jsp tylko wyświetlamy info z kontrollera bezpośrednio
    public String helloWorld(){//każda akcja kontolera musi być public i musi zwracać stringa.
        return "Hello World";
    }

    @RequestMapping(path = "/hello/{firstName}/{lastName}", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String hello(@PathVariable String firstName, @PathVariable String lastName){

        return "Witaj " + firstName +" " + lastName;
    }
    @RequestMapping("/helloView")
    public String helloView(Model model){
        LocalTime time = LocalTime.now();// tak naprawdę należałoby najpierw przypisać do zmiennych color i backgroundwybrać color black bckr white potem w ifie zamienic i na koncu raz add attribute ze zmienną
        if(time.getHour()>=8&&time.getHour()<=20) {
            model.addAttribute("color", "black");
            model.addAttribute("backgroundColor", "white");
        }else {
            model.addAttribute("color", "white");
            model.addAttribute("backgroundColor", "black");
        }
        return "home";//ponieważ mamy viewresolvera tylko wystarczy nazwa bez rozszerzenia .jsp
    }

//    #### Zadanie 3
//
//            1. Utwórz akcję dostępną pod pod adresem `/hello/<firstName>/<lastName>` gdzie `firstName` oraz `lastName`
//    będą pobranymi parametrami.
//3. Wyświetl w przeglądarce dane w następujący sposób: **Witaj** `<firstName> <lastName>`.
}
