package com.example.service;

import com.example.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2017/2/24.
 */
@RequestMapping(value = "/users")
public interface UserRestService {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<User> getUserList();

    @RequestMapping(value = "/", method = RequestMethod.POST)
    String postUser(@ModelAttribute User user);

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User getUser(@PathVariable Long id);

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
     String putUser(@PathVariable Long id, @ModelAttribute User user);

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    String deleteUser(@PathVariable Long id);
}
