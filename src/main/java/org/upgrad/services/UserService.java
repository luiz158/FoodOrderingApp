package org.upgrad.services;

import org.upgrad.models.User;

/*
 * This UserService interface gives the list of all the service that exist in the user service implementation class.
 * Controller class will be calling the service methods by this interface.
 */
public interface UserService {

    String findUserPassword(String contactNumber);

    User findUser(String contactNumber);

    void addUser(User newuser);

    void updateUserDetails(String firstname, String lastname, User user);

    User getUserById(Integer id);

    User findUserById(long id);

    Integer updateUserPassword(String password, Integer id);
}
