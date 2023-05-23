package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mysql")
public class NoteServiceImpl implements NoteService {
	
	@Autowired
	NoteRepository repo;

	@Override
	public List<Notes> showAllNotes() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Notes insertData(Notes note) {
		// TODO Auto-generated method stub
		return repo.save(note);
	}

	@Override
	public Optional<Notes> searchData(int pid) {
		// TODO Auto-generated method stub
		return repo.findById(pid);
				
	}

	@Override
	public List<Notes> findAllByTitle(String title) {
		// TODO Auto-generated method stub
		return repo.findByTitle(title);
	}

	@Override
	public List<Notes> findByAuthNTitle(String author, String title) {
		// TODO Auto-generated method stub
		return repo.findByTitleandAuthor(title, author);
	}

	@Override
	public List<NotesDto> findByAuthTitle(String title) {
		// TODO Auto-generated method stub
		return repo.findTitleAuthorOnly(title);
	}

	@Override
	public void deleteNote(int pid) {
		// TODO Auto-generated method stub
		
		repo.deleteById(pid);
		
	}

}
