package com.rgr.Rozraha;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Anime {

    private String title;
    private int series;
    private String imageSrc;
}
