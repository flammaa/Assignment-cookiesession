package com.example.demo.todo.dto.response;

import lombok.Getter;

@Getter
public class TodoUpdateResponseDto {
    private final Long todoId;
    private final String content;

    public TodoUpdateResponseDto(Long todoId, String content) {
        this.todoId = todoId;
        this.content = content;
    }
}
