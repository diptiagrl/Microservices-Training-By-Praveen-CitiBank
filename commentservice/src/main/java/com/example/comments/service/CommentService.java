package com.example.comments.service;

import java.util.List;

import com.example.comments.model.Comment;

public interface CommentService {
	
	public List<Comment> getAllComments();
	public Comment addComment(Comment comment);
	public void deleteComment(int cid);
	public Comment updateComment(Comment comment);
	public List<Comment> findCommentsByPid(int pid);

}
