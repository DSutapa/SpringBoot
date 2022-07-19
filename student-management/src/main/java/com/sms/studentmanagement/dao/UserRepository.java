package com.sms.studentmanagement.dao;

import com.sms.studentmanagement.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {
    @Query("SELECT u from Users u Where u.username = :username")
    public Users getUsersByUsername(@Param("username") String username);
}
