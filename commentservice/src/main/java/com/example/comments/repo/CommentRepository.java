package com.example.comments.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.comments.model.Comment;


@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer>{
	
	public List<Comment> findByPid(int pid);
	
}
