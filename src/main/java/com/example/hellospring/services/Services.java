package com.example.hellospring.services;

import java.time.LocalDate;

public class Services {

    public int getDate() {
        LocalDate now = LocalDate.now();
        int q = now.getDayOfMonth();
        int m = now.getMonthValue();
        int j = now.getYear() / 100;
        int k = now.getYear() % 100;
        int h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) - 2 * j);
        int d = ((h + 5) % 7) + 1;
        return d;
    }

}
