package com.example.reverseswagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    UserMapper userMapper;

    @GetMapping
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<Page<UserEntity>> getUsers(Pageable pageable) {

        Page<UserEntity> all = userRepository.findAll(pageable);
//        Page<UserDTO> userDTOPage = userMapper.pageUserToPageUserDto(all);

        return  new ResponseEntity<>(all, HttpStatus.OK);
    }
}
