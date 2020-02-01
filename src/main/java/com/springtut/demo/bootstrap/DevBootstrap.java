package com.springtut.demo.bootstrap;

import com.springtut.demo.model.Author;
import com.springtut.demo.model.Books;
import com.springtut.demo.model.Publisher;
import com.springtut.demo.repositories.AuthorRepository;
import com.springtut.demo.repositories.BookRepository;
import com.springtut.demo.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private AuthorRepository authorRepository;

    private BookRepository bookRepository;

    private PublisherRepository publisherRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        InitData();
    }


    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void InitData() {

        Author eric = new Author("Eric", "Jansses");
        Publisher wrox=new Publisher("Wrox", "USA, World");
        Books books = new Books("Welcome Holy Spirit", "35365456345",wrox );
        eric.getBooks().add(books);
        books.getAuthors().add(eric);
        publisherRepository.save(wrox);
        authorRepository.save(eric);
        bookRepository.save(books);

        Author manssen = new Author("Maric", "Jansses");
        Publisher apress = new Publisher("Apress", "USA, World");
        Books book1 = new Books("Holy Holy", "456456", apress);
        manssen.getBooks().add(book1);
        book1.getAuthors().add(manssen);
        authorRepository.save(manssen);
        publisherRepository.save(apress);
        bookRepository.save(book1);



    }

}
