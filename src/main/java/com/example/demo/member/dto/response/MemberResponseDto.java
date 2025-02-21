package com.example.demo.member.dto.response;

public class MemberResponseDto {
    private final Long memberId;
    private final String email;

    public MemberResponseDto(Long memberId, String email) {
        this.memberId = memberId;
        this.email = email;
    }
}
