package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface NoteRepository extends JpaRepository<Notes,Integer>{

	public List<Notes> findByTitle(String title);
	
	
	@Query(value="select n.title,n.author from Notes n where n.title=?1", nativeQuery = true)
	public List<NotesDto> findTitleAuthorOnly(String title);
	
	@Query("select n from Notes n where n.title=?1 and n.author=?2")
	public List<Notes> findByTitleandAuthor(String title,String author);

}
