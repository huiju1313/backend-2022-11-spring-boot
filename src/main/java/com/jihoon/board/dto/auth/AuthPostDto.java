package com.jihoon.board.dto.auth;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthPostDto {
	@NotNull
	@Email
	private String email;
	private String password;
}











