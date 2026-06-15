package com.example.practice1.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/book")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAll(){
        return bookService.getBooks();
    }

    @PostMapping
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @PutMapping(path = "{id}")
    public void updateBook(
            @PathVariable("{id}") Long id,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String author
    ){
        bookService.updateBook(id, title, author);
    }
}
