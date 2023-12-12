package com.rgr.Rozraha.service;

import org.springframework.ui.Model;

public interface AnimeService {

    String setUpHome(Model model);

    String setUpWatch(Model model);

    String setUpProfile(Model model);

    String setUpRegister(Model model);
}
