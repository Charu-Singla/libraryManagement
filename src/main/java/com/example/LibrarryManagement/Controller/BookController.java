package com.example.LibrarryManagement.Controller;

import com.example.LibrarryManagement.exception.CategoryNotFound;
import com.example.LibrarryManagement.model.Book;
import com.example.LibrarryManagement.model.Category;
import com.example.LibrarryManagement.service.BookService;
import com.example.LibrarryManagement.service.CategoryService;
import com.example.LibrarryManagement.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	BookService bookService;

	@Autowired
	CategoryService catService;

	@Autowired
	UserService userService;

	@RequestMapping(value = "/book", method = RequestMethod.POST)
	@ResponseBody
	ResponseEntity createBook(@RequestBody Book book) {
		logger.info("Entered to createBook {}", book);
		ResponseEntity<Book> rs = null;
		Optional<Category> optional = catService.categoryExists().stream()
				.filter(e -> e.getCategoryName().equals(book.getCategoryName())).findAny();
		if (optional.isPresent()) {
			bookService.addBook(book);
			rs = new ResponseEntity<Book>(book, HttpStatus.CREATED);
		} else {
			throw new CategoryNotFound("Ctageory not available");
		}
		return rs;
	};

	@GetMapping("/searchByName")
	public String searchByName(@RequestParam("name") String name, Model model) {

		List<Book> bookList = bookService.getBooksByName(name);
		model.addAttribute("bookList", bookList);
		return "viewBooks";
	}

	@GetMapping("/searchByAuthor")
	public String searchByAuthor(@RequestParam("author") String author, Model model) {

		List<Book> bookList = bookService.getBooksByAuthor(author);
		model.addAttribute("bookList", bookList);
		return "viewBooks";
	}

	@GetMapping("/searchByCategory")
	public String searchByCategory(@RequestParam("category") String category, Model model) {
		List<Book> bookList = bookService.getBooksByCategory(category);
		model.addAttribute("bookList", bookList);
		return "viewBooks";
	}

	@GetMapping("/viewBooks")
	public String listOfIssues(Model model) {
		List<Book> bookList = bookService.getBooks();
		model.addAttribute("bookList", bookList);
		return "viewBooks";
	}

	@PutMapping(value = "/assign/{isbn}/{username}")

	public String assignBook(@PathVariable("isbn") long isbn, @PathVariable("username") String username,
			@RequestBody Book book)

	{

		logger.info("Entered to assignBook {}", book);


		if (bookService.isBookAvalible(isbn)) {

			bookService.assignBook(isbn, username);
			return "success";
		}
		

		return "error";

	};
}
