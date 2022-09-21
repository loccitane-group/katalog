package com.katas.hamming

class Hamming {
    int distance(String s1, String s2) {
        if (s1.length() != s2.length()) {
            throw new ArithmeticException()
        }
        [s1.toCharArray(), s2.toCharArray()].transpose().findAll { n -> n[0] != n[1] }.size()
    }
}
