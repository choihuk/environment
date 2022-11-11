package test.environment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.environment.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
    List<Member> findByUsername(String username);
}
