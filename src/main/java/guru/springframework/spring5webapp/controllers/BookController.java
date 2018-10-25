package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class BookController {
    private BookRepository bookRespository;

    public BookController(BookRepository bookRespository) {
        this.bookRespository = bookRespository;
    }

    public String getBooks(Model model) {
        model.addAttribute("books", bookRespository.findAll());
        return "books";
    }
}
