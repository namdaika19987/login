package com.example.demo;

import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.jdbc.Sql;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTests {

    @Autowired
    private UserRespository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    @Rollback(value = false)
    public void testCreateUser() {
        User u = new User("nam", "nam1998hn@gmail.com", "123456", "0386767299");
//        u.setName("nam");
//        u.setEmail("nam1998hn@gmail.com");
//        u.setPhone("0386767299");
//        u.setPassword("123456");

        User savedUser = repo.save(u);
        User existUser = entityManager.find(User.class, savedUser.getId());
    }

}
