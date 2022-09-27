package com.adekanmi.blog_app_rest_api.Repository;

import com.adekanmi.blog_app_rest_api.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

   // @Query(value = "SELECT  * FROM user WHERE email = ?" , nativeQuery = true)
    Optional<User> findUserByEmail(String email);


}
