package com.example.demo.todo.dto.response;

import lombok.Getter;

@Getter
public class TodoSaveResponseDto {
    private final Long todoId;
    private final String content;

    public TodoSaveResponseDto(Long todoId, String content) {
        this.todoId = todoId;
        this.content = content;
    }
}
