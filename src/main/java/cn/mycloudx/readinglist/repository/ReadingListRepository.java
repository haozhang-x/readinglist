package cn.mycloudx.readinglist.repository;

import cn.mycloudx.readinglist.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author zhanghao
 * @date 2018/05/25
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {


    List<Book> findByReader(String reader);
}
