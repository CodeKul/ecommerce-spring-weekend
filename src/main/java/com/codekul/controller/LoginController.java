package com.codekul.controller;

import com.codekul.dto.Message;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by aniruddha on 24/7/16.
 */
@RestController
//@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(method = {RequestMethod.GET},value = "/user/{userName}/{password}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public /*@ResponseBody*/  ResponseEntity<Message> loginUser(@PathVariable/*("userName")*/ String userName, @PathVariable String password){

        ResponseEntity<Message> entity = null;
        if(userName.equals("android")
                && password.equals("android")){

            Message msg = new Message();
            msg.setMsg("Login Success :)");
            msg.setSts("success");

            entity = new ResponseEntity<>(msg,
                    HttpStatus.OK);
        }
        else{

            Message msg = new Message();
            msg.setMsg("Login failure :(");
            msg.setSts("fail");
            entity = new ResponseEntity<>(msg,
                    HttpStatus.BAD_REQUEST);
        }

        return entity;
    }

    @RequestMapping(method = {RequestMethod.POST},value = "/user",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Message> loginUserPost(@RequestParam String userName, @RequestParam String password){

        ResponseEntity<Message> entity = null;
        if(userName.equals("android")
                && password.equals("android")){

            Message msg = new Message();
            msg.setMsg("Login Success :)");
            msg.setSts("success");

            entity = new ResponseEntity<>(msg,
                    HttpStatus.OK);
        }
        else{

            Message msg = new Message();
            msg.setMsg("Login failure :(");
            msg.setSts("fail");
            entity = new ResponseEntity<>(msg,
                    HttpStatus.BAD_REQUEST);
        }

        return entity;
    }
}
