package com.example.demo.member.controller;

import com.example.demo.member.dto.request.MemberSaveRequestDto;
import com.example.demo.member.dto.request.MemberUpdateRequestDto;
import com.example.demo.member.dto.response.MemberResponseDto;
import com.example.demo.member.dto.response.MemberSaveResponseDto;
import com.example.demo.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<MemberSaveResponseDto> save(@RequestBody MemberSaveRequestDto dto) {
        return ResponseEntity.ok(memberService.save(dto))  ;
    }

    @GetMapping
    public ResponseEntity<List<MemberResponseDto>> getAll() {
        return ResponseEntity.ok(memberService.findAll());
    }

    @GetMapping("/{memberId}")
    public ResponseEntity<MemberResponseDto> getOne(@PathVariable Long memberId) {
        return ResponseEntity.ok(memberService.findById(memberId ));
    }

    @PutMapping("/{memberId}")
    public void update(@PathVariable Long memberId, @RequestBody MemberUpdateRequestDto dto) {
        memberService.update(memberId, dto);
    }

    @DeleteMapping("/{memberId}")
    public void delete(@PathVariable Long memberId) {
        memberService.deleteById(memberId);
    }
}
