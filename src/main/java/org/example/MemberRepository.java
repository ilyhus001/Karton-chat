package org.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<MemberModel, Long> {
    @Override
    List<MemberModel> findAll();
    MemberModel findByUsername(String username);
}
