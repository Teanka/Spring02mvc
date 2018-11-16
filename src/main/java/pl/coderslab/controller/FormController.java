package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/first")
public class FormController {
    @GetMapping(path = "/form", produces = "text/html; charset=UTF-8")
    public String getForm(){
        return "/form.jsp";//trzeba dać slasha
    }

    @PostMapping(path = "/form", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String postForm(@RequestParam String paramName){
        return paramName;
    }
}
//#### Zadanie 4
//
//        Stwórz dwie akcje:
//        1. Pierwsza akcja ma być przypisana do adresu `/form` i metody `GET`.
//        2. Utwórz formularz w pliku `jsp` z polem tekstowym o nazwie `paramName`. Pierwsza akcja ma wyświetlać ten formularz.
//        2. Druga akcja ma być przypisana do adresu `/form` i metody `POST`.
//        3. Określając adresy wykorzystaj adnotacje `@GetMapping` oraz `@PostMapping`.
//        4. W metodzie obsługiwanej metodą POST odbierz, a następnie wyświetl parametr.
//#### Zadanie 5
//        1. Dodaj do całego kontrolera przedrostek `/first`.
//        2. Sprawdź, jak zmieniły się adresy akcji z poprzedniego zadania.