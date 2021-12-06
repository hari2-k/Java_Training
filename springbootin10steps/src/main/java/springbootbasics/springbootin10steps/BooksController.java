package springbootbasics.springbootin10steps;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(new Book(1l,"Mastering Spring 5.0","Ranga Karanam"),
				new Book(2l,"Clean Code","Robert Cecil Martin"),
						new Book(3l,"Effective Java","Robert Bloch"));
	}

}
