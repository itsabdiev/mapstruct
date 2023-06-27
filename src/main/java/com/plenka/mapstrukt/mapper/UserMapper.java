package com.plenka.mapstrukt.mapper;


import com.plenka.mapstrukt.model.User;
import com.plenka.mapstrukt.model.UserDTO;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;


@Mapper(componentModel = "spring",injectionStrategy = InjectionStrategy.FIELD)
public interface UserMapper {


    @Mapping(target = "user_id",source = "id")
    @Mapping(target = "user_rank",source = "rank")
    @Mapping(target = "password",source = "username",qualifiedByName = "usernameToPassword")
    User dtoToObject(UserDTO userDTO);
    @Mapping(target = "id",source = "user_id")
    @Mapping(target = "rank",source = "user_rank")
    UserDTO objectToDto(User user);

    @Named("usernameToPassword")
    static String usernameToPassword(String username) {
        return username ;
    }


}
