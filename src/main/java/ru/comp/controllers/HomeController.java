package ru.comp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Главный контроллер
 */
@Controller
public class HomeController {
    /**
     * Гланая страница - получение всех статей
     * @return
     */
    @RequestMapping(value = "/")
    public String index(){

        return "index";
    }
}
