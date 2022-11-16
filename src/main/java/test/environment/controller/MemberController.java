package test.environment.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.environment.entity.Member;
import test.environment.repository.MemberRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    @GetMapping("/hi")
    public List<Member> searchMemberV1() {
        return memberRepository.findByUsername("member");
    }
}
