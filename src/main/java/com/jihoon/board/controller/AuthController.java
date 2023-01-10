package com.jihoon.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jihoon.board.dto.auth.AuthPostDto;
import com.jihoon.board.dto.auth.LoginDto;
import com.jihoon.board.dto.response.ResponseDto;
import com.jihoon.board.service.AuthService;

@RestController
@RequestMapping("api/auth/")
public class AuthController {
	
	// @Autowired : 해당하는 클래스 인스턴스를 자동으로 생성(주입) 해줌
	@Autowired AuthService authService;

	@PostMapping("")
	public ResponseDto<LoginDto> login(@RequestBody AuthPostDto requestBody) {
//		LoginDto result = new LoginDto("JWT", 3600000);
//		return ResponseDto.setSuccess("login success", result);
		
		return authService.login(requestBody);
	}
	
	@GetMapping("")
	public String hello() {
		return authService.hello();
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
}








