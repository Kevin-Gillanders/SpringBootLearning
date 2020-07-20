package com.javaWebService.demo;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.management.AttributeNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    List<IBookModel> BookDB;

    public BookController()
    {
        BookDB = new ArrayList<>();
        BookDB.add(new Book(1, "Dune", "Frank Herbert", true));
        BookDB.add(new Book(2, "Das Kapital", "Karl Marx", false));
        BookDB.add(new Book(3, "The Crown of Swords", "Robert Jordan", true));
        BookDB.add(new Book(4, "The Eye of the World", "Robert Jordan", true));
        System.out.println("Here in the constructor of book controller");
    }

    @GetMapping("/Books/Search")
    public List<IBookModel> ListAllBooks()
    {
        return BookDB;
    }

    @GetMapping("/Books/{bookID}")
    public IBookModel ListABook(@PathVariable int bookID)
    {
        for (IBookModel book: BookDB)
        {
            if(book.getID() == bookID)
                return book;
        }
        return new Book();
    }
    @GetMapping("/Author/{name}")
    public List<IBookModel> ListABook(@PathVariable String name)
    {
        System.out.println(String.format("The author is %s", name));
        List<IBookModel> biblio = new ArrayList<>();
        for (IBookModel book: BookDB)
        {
//            System.out.println(String.format("%s == %s = %s", book.getAuthor().toLowerCase(), name.toLowerCase(), book.getAuthor().toLowerCase().compareTo(name.toLowerCase())));
//            System.out.println(StringUtils.difference);
            if(book.getAuthor().toLowerCase().compareTo(name.toLowerCase()) == 0)
                biblio.add(book);
        }
        return biblio;
    }

}
