package guru.springframework.spring5webapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapplication.repository.BookRepository;

@Controller
public class BookController {

	private BookRepository bookRepository;
	
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@RequestMapping(path="/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		return "books/list";
		
	}
}
