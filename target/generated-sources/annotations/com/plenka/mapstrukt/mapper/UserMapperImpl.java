package com.plenka.mapstrukt.mapper;

import com.plenka.mapstrukt.model.User;
import com.plenka.mapstrukt.model.User.UserBuilder;
import com.plenka.mapstrukt.model.UserDTO;
import com.plenka.mapstrukt.model.UserDTO.UserDTOBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User dtoToObject(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.user_id( userDTO.getId() );
        user.user_rank( userDTO.getRank() );
        user.password( UserMapper.usernameToPassword( userDTO.getUsername() ) );
        user.username( userDTO.getUsername() );

        return user.build();
    }

    @Override
    public UserDTO objectToDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.id( user.getUser_id() );
        userDTO.rank( user.getUser_rank() );
        userDTO.username( user.getUsername() );

        return userDTO.build();
    }
}
