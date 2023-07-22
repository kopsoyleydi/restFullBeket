package com.example.beket.kz.mapper;



import com.example.beket.kz.dto.MainUserDTO;
import com.example.beket.kz.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MainUserMapper {
	MainUserDTO toDtoUser(User user);

	User toModelUser(MainUserDTO userDTO);

	List<MainUserDTO> toDtoListUser(List<User> list);

	List<User> toUserList(List<MainUserDTO> list);
}