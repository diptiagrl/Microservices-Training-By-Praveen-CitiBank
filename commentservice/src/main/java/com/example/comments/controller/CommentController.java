package com.example.comments.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.comments.model.Comment;
import com.example.comments.service.CommentService;

@RestController
public class CommentController {
	
	@Value("${server.port}")
	String port;
	
	@Autowired
	CommentService service;
	
	@GetMapping("/port")
	public String getPorts() {
		return "Comment Service is served from port :"+port;
	}
	
	@DeleteMapping("/comments/delete/{cid}")
	public ResponseEntity<String> deleteComments(@PathVariable int cid)
	{
		service.deleteComment(cid);
		return new ResponseEntity<>("Comment deleted",HttpStatus.OK);
	}
	
	
	@GetMapping("/comments")
	public ResponseEntity<List<Comment>> getComments(){
		return new ResponseEntity<>(service.getAllComments(),HttpStatus.OK);
	}
	
	@PostMapping("/comments")
	public ResponseEntity<Comment> postComment(@RequestBody Comment comment)
	{
		return new ResponseEntity<>(service.addComment(comment), HttpStatus.CREATED);
	}
	
	@PutMapping("/comments/update")
	public ResponseEntity<Comment> updateComment(@RequestBody Comment comment)
	{
		return new ResponseEntity<>(service.updateComment(comment), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/comments/pid/{pid}")
	public ResponseEntity<List<Comment>> getCommentsByPid(@PathVariable int pid){
		return new ResponseEntity<>(service.findCommentsByPid(pid), HttpStatus.OK);
	}
	
}
