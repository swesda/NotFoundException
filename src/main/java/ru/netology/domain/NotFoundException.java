package ru.netology.domain;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super("ID not found");
    }
}
