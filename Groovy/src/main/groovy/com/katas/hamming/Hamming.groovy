package com.katas.hamming

class Hamming {
    int NO_DIFFERENCE_HAMMING = 0
    int SINGLE_DIFFERENCE_HAMMING = 1

    int distance(String s1, String s2) {
        if (areEmptyStrands(s1, s2)) {
            return NO_DIFFERENCE_HAMMING
        }
        if (areIdenticalSingleLetterStrands(s1, s2)) {
            return NO_DIFFERENCE_HAMMING
        }
        if (areDifferentSingleLetterStrands(s1, s2)) {
            return SINGLE_DIFFERENCE_HAMMING
        }
        if (s1.length() > 1 && s2.length() > 1 && s1 == s2) {
            return NO_DIFFERENCE_HAMMING
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

    boolean areDifferentSingleLetterStrands(String s1, String s2) {
        return !areIdenticalSingleLetterStrands(s1, s2)
    }
}
