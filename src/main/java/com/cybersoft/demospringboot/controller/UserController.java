package com.cybersoft.demospringboot.controller;

import com.cybersoft.demospringboot.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * /api/user
 * @Controller + @ResponseBody => return html file or string
 * @RestController: return string
 * @RequestMapping dang ky duong dan
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/getAllUser")
    public String getAllUser(){
        return "hello user";
    }
    @GetMapping("/addUser")
    public String addUser(@RequestParam("username") String username){
        return "hello add user" + username;
    }

    @GetMapping("getDetail/{id}/{ten}")
    public String getDetail(@PathVariable("id") int id, @PathVariable("ten") String ten){
        return "hello" + id + ten;
    }

    @PostMapping("/update")
    public String updateUser(@RequestBody User user){
        return "hello" + user.getUsername() + user.getPassword() + user.getId();
    }
}
