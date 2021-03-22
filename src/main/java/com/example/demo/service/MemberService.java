package com.example.demo.service;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private final MemberRepository memberRepository= new MemoryMemberRepository();

    //회원가입
    public Long join(Member member){
        validationDuplicateMember(member); //만약 중복된 회원이 없다면!
        memberRepository.save(member);
        return member.getId();
    }

    private void validationDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    //전체 멤버 조회
    public List<Member> findAllUser(){
        return memberRepository.findAll();
    }

    //ID로 조회
    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }

}
