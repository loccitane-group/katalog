package com.katas.hamming

class Hamming {
    int NO_DIFFERENCE_HAMMING = 0
    int SINGLE_DIFFERENCE_HAMMING = 1

    int distance(String s1, String s2) {
        if (areEmptyStrands(s1, s2)) {
            return NO_DIFFERENCE_HAMMING
        }
        if (areSingleLetterIdenticalStrands(s1, s2)) {
            return NO_DIFFERENCE_HAMMING
        }
        if (areSingleLetterDifferentStrands(s1, s2)) {
            return SINGLE_DIFFERENCE_HAMMING
        }
        if (areLongIdenticalStrands(s1, s2)) {
            return NO_DIFFERENCE_HAMMING
        }
    }

    boolean areSingleLetterIdenticalStrands(s1, s2) {
        return areSingleLetterStrands(s1, s2) && areIdenticalStrands(s1, s2)
    }

    boolean areSingleLetterDifferentStrands(s1, s2) {
        return areSingleLetterStrands(s1, s2) && areDifferentStrands(s1, s2)
    }

    boolean areLongIdenticalStrands(s1, s2) {
        return areLongStrands(s1, s2) && areIdenticalStrands(s1, s2)
    }

    boolean areEmptyStrands(String s1, String s2) {
        return s1 == '' && s2 == ''
    }

    boolean areSingleLetterStrands(String s1, String s2) {
        return s1.length() == 1
                && s2.length() == 1
    }

    boolean areIdenticalStrands(String s1, String s2) {
        return s1 == s2
    }

    boolean areDifferentStrands(String s1, String s2) {
        return !areIdenticalStrands(s1, s2)
    }

    boolean areLongStrands(String s1, String s2) {
        return s1.length() > 1 && s2.length() > 1
    }
}
