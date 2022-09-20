package com.katas.hamming

class Hamming {
    int NO_DIFFERENCE_HAMMING = 0

    int distance(String s1, String s2) {
        if (areEmptyStrands(s1, s2)) {
            NO_DIFFERENCE_HAMMING
        }
        if (areIdenticalSingleLetterStrands(s1, s2)) {
            NO_DIFFERENCE_HAMMING
        }
    }

    boolean areEmptyStrands(String s1, String s2) {
        return s1 == '' && s2 == ''
    }

    boolean areIdenticalSingleLetterStrands(String s1, String s2) {
        return s1.length() == 1
                && s2.length() == 1
                && s1 == s2
    }
}
