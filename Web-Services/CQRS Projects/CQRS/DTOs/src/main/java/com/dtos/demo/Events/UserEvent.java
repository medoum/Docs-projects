package com.dtos.demo.Events;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class UserEvent {

    private final UUID id;
    private final Long userId;
    private final String username;
    private final String fullname;
    private final String address;
    private final Date dateOfBirth;

}
