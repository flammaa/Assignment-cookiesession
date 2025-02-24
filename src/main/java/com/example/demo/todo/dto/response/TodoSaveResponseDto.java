package com.example.demo.todo.dto.response;

import lombok.Getter;

@Getter
public class TodoSaveResponseDto {
    private final Long todoId;
    private final String content;
    private final Long memberId;
    private final String memberEmail;


    public TodoSaveResponseDto(Long todoId, String content, Long memberId, String memberEmail) {
        this.todoId = todoId;
        this.content = content;
        this.memberId = memberId;
        this.memberEmail = memberEmail;
    }
}
