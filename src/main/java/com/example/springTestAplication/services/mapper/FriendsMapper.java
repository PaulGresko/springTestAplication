package com.example.springTestAplication.services.mapper;


import com.example.springTestAplication.dto.friends.FriendsDTO;
import com.example.springTestAplication.entity.Friends;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FriendsMapper {
    public FriendsDTO toDto(Friends friends){
        return new FriendsDTO(friends.getId(),friends.getFriend1().getLogin(), friends.getFriend2().getLogin(), friends.getStatus());
    }
    public List<FriendsDTO> toDtoList(List<Friends> friends){
        return friends.stream().map(this::toDto).collect(Collectors.toList());
    }
}
