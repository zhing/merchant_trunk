package com.gornix.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import com.gornix.model.db.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    /*
      ref:  https://www.ibm.com/developerworks/cn/opensource/os-cn-spring-jpa/index.html
     */
    @Query("select a from User a where a.name = ?1")
   public List<User> findUsersByUsername(String name);
}
