package com.revature.hibernate_challenge;

import java.util.List;
import java.util.UUID;

import com.revature.hibernate_challenge.model.User;
import com.revature.hibernate_challenge.repository.UserDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	String id = UUID.randomUUID().toString();
//        User user = new User(id, "caco", "asdf", "Ricardo", "Aranda", "email@gmail.com", "manager");
        UserDao udao = new UserDao();
        
//        udao.saveUser(user);
        
        List<User> userList = udao.getUsers();
        System.out.println(userList.get(0).toString());
    }
}
