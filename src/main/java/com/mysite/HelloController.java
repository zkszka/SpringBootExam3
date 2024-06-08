package com.mysite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController는 사용자에게 내용을 화면에 전달. 즉 뷰의 역할을 컨트롤러가 할 수 있다
// @RestController
@Controller
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "<h1>컨트롤러 실행</h1>";
	}
	
	/*
	@GetMapping("/hello1")
	public String hello1() {
		// 아무런 경로가 없으면 Root인 templates에서 시작하는 것이다
		// hello1.html에서 .html이 기본으로 등록되어 있으므로 생략한다.
		// 요청 이름과는 상관없이 templates에서 hello1.html 파일을 찾아서 뷰를 보여준다
		// 이 경우 타임 리프가 설치되어 있어야 한다!
		return "hello1_temp";
	}
*/
}
