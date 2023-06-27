package com.example.meusgastos.domain.repository;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String mensagem){
    super(mensagem);
    } 
}
