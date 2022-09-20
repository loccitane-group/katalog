package com.katas.hamming

class Hamming {
    int distance(String s1, String s2) {

        if (s1.isEmpty() && s2.isEmpty()) 0
        else if (s1 != s2) [s1.toCharArray(), s2.toCharArray()].transpose().findAll {n -> n[0] != n[1] }.size()
         else 0
    }
}
