package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


@Service("orcl")
public class NoteServiceOrcl implements NoteService{

	@Override
	public List<Notes> showAllNotes() {
		// TODO Auto-generated method stub
		List<Notes> data = new ArrayList<>();
		data.add(new Notes(1,"abc","xyz","dummy"));
		data.add(new Notes(2,"ttile","author","dummy"));
		data.add(new Notes(1,"abc","xyz","dummy"));
		
		
		return data;
	}

	@Override
	public Notes insertData(Notes note) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Notes> searchData(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Notes> findAllByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Notes> findByAuthNTitle(String author, String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NotesDto> findByAuthTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteNote(int pid) {
		// TODO Auto-generated method stub
		
	}

}
