package _5Month2Week3Less.DAO;

import _5Month2Week3Less.entities.Author;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDAO extends JpaRepository <Author, Id> {

}
