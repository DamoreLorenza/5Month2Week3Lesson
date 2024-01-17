package _5Month2Week3Less.services;

import _5Month2Week3Less.DAO.AuthorDAO;
import _5Month2Week3Less.entities.Author;
import _5Month2Week3Less.exceptions.NotFoundException;
import epicode.u5d7hw.entities.Author;
import epicode.u5d7hw.exceptions.NotFoundException;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.*;

@Service
public class AuthorsService {

    @Autowired
    private AuthorDAO authorDAO;

    public Page <Author> getAuthors(int page, int size){
        Pageable pageable= PageRequest.of(page, size);
        return AuthorDAO.findAll(pageable);
    }

    private final List<Author> authors = new ArrayList<>();

    public Author save(Author body) {
        Random rndm = new Random();
        author.setId(rndm.nextInt());
        author.setAvatar("https://ui-avatars.com/api/?name="+ author.getName() + "+" + author.getSurname());
        this.authors.add(author);
        return author;
    }



    public Author findById(int id) {
        Author found = null;

        for (Author author : authors) {
            if (author.getId() == id)
                found = author;
        }
        if (found == null)
            throw new NotFoundException(id);
        return found;
    }

    public void findByIdAndDelete(int id) {
        ListIterator<Author> iterator = this.authors.listIterator();

        while (iterator.hasNext()) {
            Author currentAuthor = iterator.next();
            if (currentAuthor.getId() == id) {
                iterator.remove();
            }
        }
    }

    public Author findByIdAndUpdate(int id, Author author) {
        Author found = null;

        for (Author currentAuthor : authors) {
            if (currentAuthor.getId() == id) {
                found = currentAuthor;
                found.setName(author.getName());
                found.setSurname(author.getSurname());
                found.setId(id);
            }
        }
        if (found == null)
            throw new NotFoundException(id);
        return found;

    }
}
