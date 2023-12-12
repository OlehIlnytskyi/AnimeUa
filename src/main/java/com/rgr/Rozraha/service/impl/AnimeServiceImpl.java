package com.rgr.Rozraha.service.impl;

import com.rgr.Rozraha.data.AnimeProvider;
import com.rgr.Rozraha.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class AnimeServiceImpl implements AnimeService {

    @Autowired
    private AnimeProvider animeProvider;

    @Override
    public String setUpHome(Model model) {
        model.addAttribute("anime", animeProvider.getAllAnime());
        return "home";
    }

    @Override
    public String setUpWatch(Model model) {
        return "watch";
    }

    @Override
    public String setUpProfile(Model model) {
        return "profile";
    }

    @Override
    public String setUpRegister(Model model) {
        return "register";
    }
}
