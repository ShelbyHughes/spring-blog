package com.codeup.springblog.repositiories;

import com.codeup.springblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {

    Post findByTitle(String title);
    Post findById(long id);

}
