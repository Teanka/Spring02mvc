package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    @RequestMapping(path = "/showRandom", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String showRandom(){//każda akcja kontolera musi być public i musi zwracać stringa.
        Random random = new Random();
        String randNum = String.valueOf(random.nextInt(101)-1);
        return "Wylosowano liczbę: " + randNum;
    }
    @RequestMapping(path = "/random/{min}/{max}", produces = "text/html; charset=UTF-8")//jest to uri więc PathVariable
    //spr pod adresem http://localhost:8080/random/5/20
    @ResponseBody
    public String randomMax(@PathVariable int min, @PathVariable int max){
        Random random = new Random();
        int randInt = random.nextInt(max-min+1)+min;
//        return "Użytkownik podał wartość " +max + ". Wylosowano liczbę: " + randInt;
        return "Użytkownik podał wartości " + min + " i " + max + ".\n" +
                "       Wylosowano liczbę: " + randInt;
    }
}
//#### Zadanie 3
//
//        1. Utwórz kontroler o nazwie `RandomController`.
//        2. Utwórz akcję kontrolera o nazwie `showRandom`, która wylosuje liczbę z zakresu od 1 do 100.
//        3. Wyświetli w przeglądarce napis: **Wylosowano liczbę: <wylosowana liczba>**.

//1. Utwórz akcję dostępną pod pod adresem `/random/<max>` gdzie `max` będzie górną granicą zbioru z którego zostanie wylosowana liczba.
//        2. Wylosuj wartość od 1 do `max`.
//        3. Wyświetl w przeglądarce dane w następujący sposób: **Użytkownik podał wartość <max>. Wylosowano liczbę: <wylosowana liczba>**.
//
//        #### Zadanie 2 - rozwiązywane z wykładowcą
//
//        1. Zmodyfikuj poprzednią akcję aby przyjmowała dodatkowo wartość minimalną `<min>`.
//        2. Wylosuj wartość od `min` do `max`.
//        3. Wyświetl w przeglądarce dane w następujący sposób: **Użytkownik podał wartości** `<min>` i `<max>`.
//        **Wylosowano liczbę:** `<wylosowana liczba>`.