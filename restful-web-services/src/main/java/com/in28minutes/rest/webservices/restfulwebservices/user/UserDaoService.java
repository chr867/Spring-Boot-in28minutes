package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<User>();
    private static int addCount = 0;
    static {
        users.add(new User(
                ++addCount,
                "Adam",
                LocalDate.now().minusYears(30)
        ));
        users.add(new User(
                ++addCount,
                "Eve",
                LocalDate.now().minusYears(25)
        ));
        users.add(new User(
                ++addCount,
                "Jim",
                LocalDate.now().minusYears(20)
        ));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void saveUser(User user) {
        user.setId(++addCount);
        users.add(user);
    }

    public void deleteUserById(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}
