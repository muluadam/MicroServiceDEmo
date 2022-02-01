package com.muluadam.userservicewithfeign.repository;

import com.muluadam.userservicewithfeign.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User getUserByUserId(Long userId);
}
