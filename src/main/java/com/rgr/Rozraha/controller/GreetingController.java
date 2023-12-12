package com.rgr.Rozraha.controller;

import com.rgr.Rozraha.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

	@Autowired
	private AnimeService animeService;

	@GetMapping("/home")
	public String home(Model model) {
		return animeService.setUpHome(model);
	}

	@GetMapping("/watch")
	public String watch(Model model) {
		return animeService.setUpWatch(model);
	}

	@GetMapping("/profile")
	public String profile(Model model) {
		return animeService.setUpProfile(model);
	}

	@GetMapping("/register")
	public String register(Model model) {
		return animeService.setUpRegister(model);
	}
}