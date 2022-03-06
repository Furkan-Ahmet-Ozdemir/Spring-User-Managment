package com.ornito.usermanagmentsystem.user;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
    @Autowired
    private UserRepository repo;

    @Test
    public void testAddNew(){
        User user = new User();
        user.setEmail("mehmet@gmail.com");
        user.setFirstName("mehmet");
        user.setPassword("123456");
        user.setLastName("uzun");

        User savedUser =  repo.save(user);


        Assertions.assertNotNull(savedUser);
//        Assertions.assertNotEquals(savedUser.getId().compareTo("1"));
    }



}
