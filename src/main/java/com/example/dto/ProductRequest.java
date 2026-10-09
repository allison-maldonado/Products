package com.example.dto;

public record ProductRequest(
    String name,
    Double Price,
    int stock
) {

}
