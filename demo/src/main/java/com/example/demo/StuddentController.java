package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuddentController {
	
	private final StuddentRepository studdentRepository;
	
	StuddentController(StuddentRepository studdentRepository){
		this.studdentRepository = studdentRepository;
	}
	
	@GetMapping("/student1")
	List<Studdent> getAll(){
		
		return studdentRepository.findAll();
	}
	
	@GetMapping("/student1/{id}")
	Optional<Studdent> getStuddentById(@PathVariable Long id){
		return studdentRepository.findById(id);
	}
	
	@PostMapping("/student1")
	Studdent newStuddent(@RequestBody Studdent studdent){
		
		if(studdent.getMarks()>=80 && studdent.getMarks()<=100)
		{
	 studdent.setGrade("A");
		}
		
		else if(studdent.getMarks()>=65 && studdent.getMarks()<80)
		{
			studdent.setGrade("B");
		}
		
		else if(studdent.getMarks()>=50 && studdent.getMarks()<65)
		{
			studdent.setGrade("C");
		}
		
		else if(studdent.getMarks()>=35 && studdent.getMarks()<50)
		{
			studdent.setGrade("D");
		}
		
		else if(studdent.getMarks()<35 && studdent.getMarks()>=0)
		{
			studdent.setGrade("Fail");
		}
		
		else {
			studdent.setGrade("Invalid");
		}
		
		return studdentRepository.save(studdent);
	}
	
	@DeleteMapping("/studdent1/{id}")
	void deleteUserById(@PathVariable Long id){
		studdentRepository.deleteById(id);
	}
}