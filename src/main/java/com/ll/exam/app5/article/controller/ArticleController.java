package com.ll.exam.app5.article.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ArticleController {
	@GetMapping("/article/write")
	public String write() {
		return "article/write";
	}

	@PostMapping("/article/write")
	@ResponseBody
	public MultipartFile post_write(@RequestParam("img1") MultipartFile img1) {
		return img1;
	}
}
