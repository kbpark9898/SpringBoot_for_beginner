package com.example.demo.controller;

import com.example.demo.domain.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// git config change!
@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping(value ="/members/new")
    public String createRegisterForm(){
        return "members/createMemberForm";
    }

    @PostMapping(value = "/members/new")
    public String memberRegister(MemberForm memberForm){
        Member member = new Member();
        member.setName(memberForm.getName());
        memberService.join(member);
        return "redirect:/";
    }
}
