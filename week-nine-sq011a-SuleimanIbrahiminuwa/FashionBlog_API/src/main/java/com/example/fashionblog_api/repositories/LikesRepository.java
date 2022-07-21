package com.example.fashionblog_api.repositories;

import com.example.fashionblog_api.models.Likes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LikesRepository extends JpaRepository<Likes, Long> {
    boolean existsLikesById(Long id);
    Optional<Likes> findLikesById(Long id);
}
