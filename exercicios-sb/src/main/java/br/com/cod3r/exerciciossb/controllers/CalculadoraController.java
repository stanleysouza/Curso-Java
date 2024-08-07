package br.com.cod3r.exerciciossb.controllers;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    //    /calculador/somar/10/20
    @GetMapping("/somar/{a}/{b}")
    public String somar(@PathVariable int a,@PathVariable int b){
        int soma = a +b;
        return "O valor da soma é " + soma;
    }
    //    /calculador/subtrair/?a=100&b=39
    @GetMapping("/subtrair")
    public String subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        int result = a - b;
        return "O valor da subtração é " + result;
    }
}
