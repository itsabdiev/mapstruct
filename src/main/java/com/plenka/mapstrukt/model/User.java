package com.plenka.mapstrukt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {
    private Long user_id;
    private String username;
    private Integer user_rank;
    private String password;
}
