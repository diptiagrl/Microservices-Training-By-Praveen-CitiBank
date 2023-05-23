package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface NoteService {
	
	public List<Notes> showAllNotes();
	public Notes insertData(Notes note);
	public Optional<Notes> searchData(int pid);
	public List<Notes> findAllByTitle(String title);
	public List<Notes> findByAuthNTitle(String author,String title);
	public void deleteNote(int pid);
	public List<NotesDto> findByAuthTitle(String title);

}
