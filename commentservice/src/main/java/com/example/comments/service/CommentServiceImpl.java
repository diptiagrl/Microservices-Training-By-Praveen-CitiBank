package com.example.comments.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.comments.model.Comment;
import com.example.comments.repo.CommentRepository;


@Service
public class CommentServiceImpl implements CommentService {
	
	
	@Autowired
	CommentRepository repo;

	@Override
	public List<Comment> getAllComments() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteComment(int cid) {
		// TODO Auto-generated method stub
		
		repo.deleteById(cid);

	}

	@Override
	public Comment updateComment(Comment comment) {
		// TODO Auto-generated method stub
		return repo.save(comment);
	}

	@Override
	public List<Comment> findCommentsByPid(int pid) {
		// TODO Auto-generated method stub
		return repo.findByPid(pid);
	}

	@Override
	public Comment addComment(Comment comment) {
		// TODO Auto-generated method stub
		return repo.save(comment);
	}

}
