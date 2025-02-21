package com.example.demo.member.dto.response;

import lombok.Getter;

@Getter
public class MemberSaveResponseDto {
    private final Long memberId;
    private final String email;

    public MemberSaveResponseDto(Long memberId, String email) {
        this.memberId = memberId;
        this.email = email;
    }
}
