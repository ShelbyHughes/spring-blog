package com.codeup.springblog.repositiories;

import com.codeup.springblog.model.Post;
import com.codeup.springblog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Post, Long> {
    User findById(long id);
}
