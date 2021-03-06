package me.clevekim.study.springboot.bootstrap.persistance.repo;

import me.clevekim.study.springboot.bootstrap.persistance.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by younghwan.kim@linecorp.com on 2019-04-08
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
