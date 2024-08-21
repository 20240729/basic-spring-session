package com.sparta.basicspringsession.controller;

import com.sparta.basicspringsession.repository.MemberRepository;
import com.sparta.basicspringsession.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberController {
    private final MemberService memberService;
}
