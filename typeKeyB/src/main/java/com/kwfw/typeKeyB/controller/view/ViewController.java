package com.kwfw.typeKeyB.controller.view;

import org.springframework.stereotype.Controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Controller
public class ViewController {
	public String homeView(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		test
		return "/";
	}
}
