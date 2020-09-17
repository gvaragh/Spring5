package guru.springframework.spring5webapplication.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapplication.domain.Author;
import guru.springframework.spring5webapplication.domain.Book;
import guru.springframework.spring5webapplication.domain.Publisher;
import guru.springframework.spring5webapplication.repository.AuthorRepository;
import guru.springframework.spring5webapplication.repository.BookRepository;
import guru.springframework.spring5webapplication.repository.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner{

	private AuthorRepository authorRepository;
	private BookRepository bookrepository;
	private PublisherRepository publisherRepository;
	
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookrepository, PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookrepository = bookrepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Started in BootStrap ");
		
		Publisher publisher = new Publisher();
		publisher.setName("O'reily");
		publisher.setCity("SFO");
		publisher.setState("CA");
		
		publisherRepository.save(publisher);
		
		System.out.println("Publisher count is "+publisherRepository.count());
		
		Author author = new Author("Evans", "Eric");
		Book book = new Book("Book 1", "12345");
		book.getAuthors().add(author);
		author.getBooks().add(book);
		
		authorRepository.save(author);
		bookrepository.save(book);
		
		author = new Author("John", "Thompson");
		book = new Book("Book 2", "678910");
		book.getAuthors().add(author);
		author.getBooks().add(book);
		
		authorRepository.save(author);
		bookrepository.save(book);
		
		System.out.println("Saved "+authorRepository.count() +" authors and " + bookrepository.count() +" books Successfully");
		
		
	}

}
