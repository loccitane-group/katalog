package com.katas.hamming

class Hamming {
    static int distance(String strand1, String strand2) {
        validateStrands(strand1, strand2)
        return countStrandDistance(strand1, strand2)
    }

    private static int countStrandDistance(String strand1, String strand2) {
        if (bothStrandsAreEmpty(strand1, strand2))
            return 0

        [strand1.toCharArray(), strand2.toCharArray()]
                .transpose()
                .inject(0) {
                    sum, current -> sum + (current[0] == current[1] ? 0 : 1)
                }
    }

    static def validateStrands(String strand1, String strand2) {
        if (strand1.length() != strand2.length())
            throw new ArithmeticException("Strands are of different sizes strand1 (${strand1.length()}) <> strand2  (${strand2.length()})")
    }

    static boolean bothStrandsAreEmpty(String s1, String s2) {
        s1.length() == 0 && s1.length() == s2.length()
    }
}
