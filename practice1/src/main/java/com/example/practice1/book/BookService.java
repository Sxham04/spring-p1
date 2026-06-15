package com.example.practice1.book;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

    @Transactional
    public void updateBook(Long id, String title, String author){
        Optional<Book> book = bookRepository.findById(id);
        if(title != null && !title.isEmpty() && !Objects.equals(book.get().getTitle(), title)){
            book.get().setTitle(title);
        }
    }
}
