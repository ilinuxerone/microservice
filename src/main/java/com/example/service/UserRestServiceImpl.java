package com.example.service;

import com.example.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by Administrator on 2017/2/25.
 */
@RestController
public class UserRestServiceImpl implements  UserRestService {

    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @Override
    public List<User> getUserList() {
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }

    @Override
    public String postUser(@ModelAttribute User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @Override
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @Override
    public String putUser(@PathVariable Long id, @ModelAttribute User user) {
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    @Override
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }
}
