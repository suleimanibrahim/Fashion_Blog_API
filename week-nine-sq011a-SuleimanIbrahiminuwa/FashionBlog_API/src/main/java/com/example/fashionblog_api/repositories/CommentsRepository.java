package com.example.fashionblog_api.repositories;

import com.example.fashionblog_api.models.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long> {
    Optional<Comments> findCommentsByIdAndMessage(Long id, String message);
    boolean existsCommentsById(Long id);
}
