package com.example.beket.kz.mapper;

import com.example.beket.kz.dto.RegistrationUserDto;
import com.example.beket.kz.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RegistrationUserMapper {
	RegistrationUserDto toDtoUser(User user);

	User toModelUser(RegistrationUserDto userDTO);

	List<RegistrationUserDto> toDtoListUser(List<User> list);

	List<User> toUserList(List<RegistrationUserDto> list);
}
