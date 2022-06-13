package com.rgr.Rozraha.Controllers;

import com.rgr.Rozraha.Anime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
public class GreetingController {

	@GetMapping("/home")	//Лінк сторінки
	public String home(Model model) {
		List<Anime> list = Arrays.asList(
				new Anime("Fullmetal Alchemist", 24, "https://pbs.twimg.com/media/DsFZDcHW0AAediC?format=jpg&name=4096x4096"),
				new Anime("Cowboy Bebop", 24, "https://i.etsystatic.com/6285100/r/il/ed1833/1617717980/il_570xN.1617717980_7jaj.jpg"),
				new Anime("Code Geass Season 1", 24,  "https://m.media-amazon.com/images/I/71lfpyqBZJL._AC_SY679_.jpg"),
				new Anime("Spy Family", 9, "https://static.zerochan.net/Spy.x.Family.full.3493446.jpg"),
				new Anime("Bleach",366,"https://i.pinimg.com/750x/bc/c9/51/bcc951d89f74a93512439c964851215c.jpg"),
				new Anime("One Piece",1020,"https://i.pinimg.com/originals/04/65/2b/04652b44ea7c1275d1022d98d59ecc97.jpg"),
				new Anime("Naruto: Shippuden",500,"https://i.pinimg.com/originals/43/df/fd/43dffd8f91a906826e8e7cb2140dd734.jpg"),
				new Anime("Fate: stay night",24,"https://picfiles.alphacoders.com/437/thumb-437801.jpg"),
				new Anime("Black Clover",170,"https://i.pinimg.com/550x/34/5c/31/345c3185d85e7c67931a44d542ca9760.jpg"),
				new Anime("Fate",12,"https://animego.org/media/cache/thumbs_250x350/upload/anime/images/5c6e608c575b4586474758.jpg"),
				new Anime("Berserker",25,"https://images3.alphacoders.com/788/thumb-1920-788452.jpg"),
				new Anime("Avatar of the king",12,"https://i.pinimg.com/originals/14/2a/51/142a510e45d34279e68847f82c08d668.jpg")
		);
		Collections.shuffle(list);

		model.addAttribute("anime", list);
		return "home";		//З якого html-елементу зчитує інфу
	}

	@GetMapping("/watch")
	public String watch(Model model) {

		return "watch";
	}

	@GetMapping("/profile")
	public String profile(Model model) {

		return "profile";
	}

	@GetMapping("/register")
	public String register(Model model) {

		return "register";
	}
}