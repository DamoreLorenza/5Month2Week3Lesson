package _5Month2Week3Less.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="BlogPost")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Blogpost {
    private int id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private double readingTime;
}
