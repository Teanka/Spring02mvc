package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Controller
public class FreeTimeController {
    @RequestMapping(path = "/freeTime", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String freeTime(){
//        LocalDateTime data = LocalDateTime.of(2018,11, 11,12,44);
        LocalDateTime data = LocalDateTime.now();
        System.out.println(data.getHour());
        if(data.getDayOfWeek().equals(DayOfWeek.SATURDAY)|| data.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
            return "Wolne";
        } else if (data.getHour()>=9 && data.getHour()<=17){
            return "Pracuję, nie dzwoń.";
        }
        return "Po pracy";
    }

//    #### Zadanie 4
//
//            1. Utwórz kontroler o nazwie `FreeTimeController`.
//            2. Pobierz aktualną datę.
//3. Sprawdź aktualny dzień tygodnia oraz aktualną godzinę.
//4. Jeśli dzień przypada na sobotę lub niedzielę, zwróć tekst `Wolne`.
//            5. Jeśli dzień przypada na dzień roboczy, a godzina od 9 do 17, zwróć tekst `Pracuje, nie dzwoń.`.
//            6. Jeśli dzień przypada na dzień roboczy, a godzina poza zakresem 9-17 zwróć tekst `Po Pracy`.
//            7. Aby przetestować działanie aplikacji, możesz zamiast aktualnej daty, pobrać wybraną przez siebie datę i godzinę.
}
