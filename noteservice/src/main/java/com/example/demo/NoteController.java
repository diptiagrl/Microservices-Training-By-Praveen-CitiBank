package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoteController {
	
	@Autowired
	@Qualifier("mysql")
	NoteService service;
	
	@DeleteMapping("/note/delete/{pid}")
	public ResponseEntity<String> deleteNotes(@PathVariable int pid){
		service.deleteNote(pid);
		return new ResponseEntity<>("note deleted",HttpStatus.OK);
	}
	
	
	@GetMapping("/note/dto/{title}")
	public ResponseEntity<List<NotesDto>> showTitleAuthor(@PathVariable String title){
		return new ResponseEntity<>(service.findByAuthTitle(title),
				HttpStatus.OK);
	}
	
	@GetMapping("/note/title/{title}/author/{author}")
	public ResponseEntity<List<Notes>> showAllByTitleAuthor(@PathVariable String title,
			@PathVariable String author){
		return new ResponseEntity<>(service.findByAuthNTitle(author, title),
				HttpStatus.OK);
	}
	
	
	@GetMapping("/note/title/{title}")
	public ResponseEntity<List<Notes>> showAllNotes(@PathVariable String title){
		return new ResponseEntity<>(service.findAllByTitle(title),
				HttpStatus.OK);
	}
	
	@GetMapping("/note/{pid}")
	public ResponseEntity<Optional<Notes>> searchForDat(@PathVariable int pid){
		Optional<Notes> note = service.searchData(pid);
		return new ResponseEntity<>(note,HttpStatus.OK);
		
	}
	
	@PostMapping("/note")
	public ResponseEntity<Notes> insertPost(@RequestBody Notes note){
		return new  ResponseEntity<>(service.insertData(note),HttpStatus.CREATED);
	}
	
	@GetMapping("/note")
	public ResponseEntity<List<Notes>> showAllNotes(){
		return new ResponseEntity<>(service.showAllNotes(),
				HttpStatus.OK);
	}

}
