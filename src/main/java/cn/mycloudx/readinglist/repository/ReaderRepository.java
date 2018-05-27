package cn.mycloudx.readinglist.repository;

import cn.mycloudx.readinglist.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhanghao
 * @date 2018/05/26
 */
public interface ReaderRepository extends JpaRepository<Reader,String> {
}
