package pl.coderslab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("pl.coderslab")
public class AppConfig extends WebMvcConfigurerAdapter {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver =
                new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver; }
    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
//1. Dodaj klasę konfiguracji.
//        2. Utwórz inicjalizator aplikacji.
//        3. Utwórz kontroler o nazwie `HelloController`.
//        4. Utwórz akcję o nazwie `helloWorld`, oraz przypisz jej adres `hello`.
//        5. Dodaj adnotację @ResponseBody i zwróć napis **Hello World**.
//        6. Uruchom aplikację i sprawdź w przeglądarce utworzoną akcję.

//#### Zadanie 1 - rozwiązywane z wykładowcą
//
//        1. Zdefiniuj w klasie konfiguracji `ViewResolver` - skorzystaj z przykładu z prezentacji.
//        2. Utwórz widok o nazwie `home.jsp` ze statyczną zawartością html //nasze jsp muszą być w /WEB-INF/views
// znajdujący się w lokalizacji określonej w konfiguracji `ViewResolver`:
//        ```html
//    <h1>Witaj w widoku</h1>
//    ```
//        3. W kontrolerze `HelloController` utwórz akcję `helloView`, dostępną pod adresem `/helloView`,
//        która wyświetli ten widok.

