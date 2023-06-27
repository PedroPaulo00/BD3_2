package com.example.meusgastos.domain.repository;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String mensagem){
        super (mensagem);
    }
}