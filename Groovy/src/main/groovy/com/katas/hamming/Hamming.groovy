package com.katas.hamming

class Hamming {
    int distance(String s1, String s2) {
        // XOR logical does not exist in Groovy :(
        if ("$s1:$s2" ==~ /(:.+)|(.+:)/) throw new ArithmeticException()

        if (s1 == "") {
            0
        } else {
            ((s1[0] == s2[0]) ? 0 : 1) + distance(s1.substring(1), s2.substring(1))
        }
    }
}
