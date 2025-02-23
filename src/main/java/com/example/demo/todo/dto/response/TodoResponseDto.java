package com.example.demo.todo.dto.response;

public class TodoResponseDto {

    private final Long todoId;
    private final String content;

    public TodoResponseDto(Long todoId, String content) {
        this.todoId = todoId;
        this.content = content;
    }
}
