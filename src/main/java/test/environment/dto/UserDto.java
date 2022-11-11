package test.environment.dto;

import lombok.Data;

@Data
public class UserDto {

    public UserDto() {
    }

    public UserDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
}
