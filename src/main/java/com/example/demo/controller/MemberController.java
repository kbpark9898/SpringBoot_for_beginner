package com.example.demo.controller;

import com.example.demo.domain.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

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

    @GetMapping(value="/members")
    public String memberList(Model model){
        List<Member> list = memberService.findAllUser();
        model.addAttribute("members", list);
        return "members/memberList";
    }
}
