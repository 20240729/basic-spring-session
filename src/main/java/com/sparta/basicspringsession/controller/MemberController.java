package com.sparta.basicspringsession.controller;

import com.sparta.basicspringsession.dto.MemberDetailResponseDto;
import com.sparta.basicspringsession.dto.MemberSaveRequestDto;
import com.sparta.basicspringsession.dto.MemberSaveResponseDto;
import com.sparta.basicspringsession.dto.MemberSimpleResponseDto;
import com.sparta.basicspringsession.repository.MemberRepository;
import com.sparta.basicspringsession.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/members")
    public ResponseEntity<MemberSaveResponseDto> saveMember(@RequestBody MemberSaveRequestDto requestDto){
        return ResponseEntity.ok(memberService.saveMember(requestDto));
    }

    @GetMapping("/members")
    public ResponseEntity<List<MemberSimpleResponseDto>> getAllMembers(){
        return ResponseEntity.ok(memberService.getMembers());
    }

    @GetMapping("/members{memberId}")
    public ResponseEntity<MemberDetailResponseDto> getMember(@PathVariable Long memberId){
        return ResponseEntity.ok(memberService.getMember(memberId));
    }





}
