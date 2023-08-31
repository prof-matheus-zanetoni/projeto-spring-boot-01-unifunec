package br.com.calculadora.projetocalculadora.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import br.com.calculadora.projetocalculadora.exceptions.NumeroInvalidoException;
import br.com.calculadora.projetocalculadora.models.Mensagem;

@RestControllerAdvice
public class CalculadoraControllerAdvice {
    
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({NumeroInvalidoException.class, ArithmeticException.class})
    public Mensagem ExceptionHandler01(Exception ex) {
        Mensagem mensagem = new Mensagem(ex.getMessage());
        return mensagem;
    }
}