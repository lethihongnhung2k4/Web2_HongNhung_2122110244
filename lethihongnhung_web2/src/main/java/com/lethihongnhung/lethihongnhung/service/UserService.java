package com.lethihongnhung.lethihongnhung.service;
import com.lethihongnhung.lethihongnhung.payloads.UserDTO;
import com.lethihongnhung.lethihongnhung.payloads.UserResponse;
public interface UserService {
  UserDTO registerUser(UserDTO userDTO);

  UserResponse getAllUsers(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

  UserDTO getUserById(Long userId);

  UserDTO updateUser(Long userId, UserDTO userDTO);

  String deleteUser(Long userId);

UserDTO getUserByEmail(String email);
}