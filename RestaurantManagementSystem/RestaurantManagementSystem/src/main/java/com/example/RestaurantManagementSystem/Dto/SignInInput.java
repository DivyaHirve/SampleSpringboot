package com.example.RestaurantManagementSystem.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignInInput {

    @NotBlank(message = "Email cannot be blank")
    @Email
    private String email;

    @NotEmpty
    private String password;


}
