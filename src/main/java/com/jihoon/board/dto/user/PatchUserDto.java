package com.jihoon.board.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PatchUserDto {
	private String email;
	private String nickname;
	private String profile;
}
