package com.example.reverseswagger;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "name", target = "name")
    @Mapping(source = "outraCoisa", target = "outraCoisa")
    @Mapping(source = "date", target = "date")
    UserDTO userToUserDto(UserEntity user);

    default Page<UserDTO> pageUserToPageUserDto(Page<UserEntity> page) {
        return page.map(this::userToUserDto);
    }
}
