package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

    @RequestMapping("/setcookie/{value1}/{value2}")
    @ResponseBody
    public String setcookie(HttpServletResponse response, @PathVariable String value1, @PathVariable String value2) {
        Cookie cookie1 = new Cookie("cookie1", "value1");
        Cookie cookie2 = new Cookie("cookie2", "value2");
        cookie1.setPath("/");
        cookie2.setPath("/");
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        return "setcookie";
    }

    @RequestMapping("/getcookie")
    @ResponseBody
    public String cookieget(HttpServletRequest request){
        Cookie c = WebUtils.getCookie(request, "cookie1");
        Cookie c1 = WebUtils.getCookie(request, "cookie2");
        return "cookie1: " + c.getValue() + "cookie2: " + c1.getValue();
    }

    @RequestMapping("/getcookies")
    @ResponseBody
    public String getcookies(@CookieValue("cookie1") String cookie1,@CookieValue("cookie2") String cookie2){
        return "cookie1: " +cookie1 + " cookie2: " +cookie2;
    }
}
//    Utwórz kontroler `CookieController`.
//        2. Utwórz akcję dostępną pod adresem `/setcookie/<value1>/<value>`.
//        3. Akcja ma pobrać wartości parametrów `value1` oraz `value2`, a następnie ustawić
//        dwa ciasteczka o nazwach `cookie1` i wartości `value1` oraz `cookie2` i wartości `value2`.
//        4.Dla ciasteczek ustaw wartość ścieżki jak w przykładzie: `cookie1.setPath("/");`
//        5. Utwórz akcję dostępną pod adresem `/getcookies`, która pobierze wartości ciasteczek.
//        6. Wykorzystaj 2 sposoby opisane w prezentacji - klasę `WebUtils` oraz adnotację `@CookieValue`.
//        7. Wyświetl pobrane dane.
