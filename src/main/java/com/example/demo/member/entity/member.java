package com.example.demo.member.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long memberId;
    private String email;

    public member(String email) {
        this.email = email;
    }
}
