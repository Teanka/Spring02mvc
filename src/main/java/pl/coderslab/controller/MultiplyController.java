package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MultiplyController {
//    http://localhost:8080/multiply1?size=7
    @RequestMapping("/multiply1")
    @ResponseBody
    public String multiply1(@RequestParam(defaultValue = "10") String size) {
        StringBuilder sb = new StringBuilder();
        int size1 = Integer.parseInt(size);
        sb.append("<table><thead></thead><tbody>");
        for (int i = 1; i <= size1; i++) {
            sb.append("<tr>");
            for (int j = 1; j <= size1; j++) {
                sb.append("<td style='border:solid #e3e3e3 1px;'>")
                        .append(" | ")
                        .append(String.valueOf(i * j))
                        .append(" | ")
                        .append("</td>");
            }
            sb.append("</tr>");
        }
        sb.append("</tbody></table>");

//        model.addAttribute("size", "size");
        return sb.toString();
}

    @GetMapping("/multiply")
    public String multiply(Model model,@RequestParam(defaultValue = "10") String size) {
       model.addAttribute("size", size);
        return "multiply";
    }

    @RequestMapping("/paramMultiply/{row}/{col}")
    public String multiply(Model model,@PathVariable String row, @PathVariable String col) {
        model.addAttribute("row", row);
        model.addAttribute("col", col);
        return "paramMultiply";
    }
}
//1. Utwórz kontroler o nazwie `MultiplyController`.
//        2. Utwórz nową akcję multiply, dostępną pod adresem `/multiply`.
//        3. Akcja ma pobierać jeden parametr w URL o nazwie `size`.
//        4. Ustaw domyślną wartość tego parametru na wartość 10.
//        5. Przekaż zmienną do widoku a następnie wyświetl tabliczkę mnożenia w tabelce html w postaci:
//
//
//        | x | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10|
//        |---|---|---|---|---|---|---|---|---|---|---|
//        | 1 | 1 | 2 | 3 |   |   |   |   |   |   |   |
//        | 2 |       ...                             |
//        | 3 |                                       |
//        | 4 |                                       |
//        | ...                                       |
//        | 9 | 9 |18 |27 |36 |45 |54 |63 |72 |81 |90 |
//        | 10|...|

//### Zadanie 4
//
//        1. W kontrolerze `MultiplyController` utwórz akcję `/paramMultiply/<rows>/<cols>`,
//        2. Akcja ma przyjmować 2 parametry `<rows>` oraz `<cols>`.
//        3. Przekaż zmienne do widoku, a następnie wyświetl tabliczkę mnożenia w tabelce html w postaci:
//
//
//        Parametr rows = 10, cols =2.
//
//        | x | 1 | 2 |
//        |---|---|---|
//        | 1 | 1 | 2 |
//        | 2 | 2 | 4 |
//        | 3 | 3 | 6 |
//        | 4 | 4 | 8 |
//        | ...
//        | 9 | 9 | 18|
//        | 10| 10| 20|