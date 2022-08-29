package org.example;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class User {
    String username;
    String firstName;
    String lastName;
}
