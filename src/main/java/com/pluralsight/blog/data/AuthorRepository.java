package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AuthorRepository extends JpaRepository<Author, Long> {
   /* public List<Author> findAll() {
        return new ArrayList<>();
    }

    public List<Author> saveAll(List<Author> authors) {
        return new ArrayList<>();
    }*/
}