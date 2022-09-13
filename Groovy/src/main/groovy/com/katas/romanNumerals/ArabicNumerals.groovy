package com.katas.romanNumerals

class ArabicNumerals {

    def romanBits = [
            ["I", "V"], // < 9, we need "I" and "V"
            ["X", "L"],
            ["C", "D"],
            ["M", "?"],
            ["!", "§"]
    ]

    /**
     * Just take care of one arabic digit
     * @param n in [0, 10[
     * @param log10 >=0
     * @return
     */
    String getRomanChunk(Integer n, Integer log10){
        def bit1 = romanBits[log10][0]
        def bit5 = romanBits[log10][1]
        def bit10 = romanBits[log10+1][0]
        switch(n) {
            case 0..3:
                bit1 * n
                break
            case 4:
                "${bit1}${bit5}"
                break
            case 5..8:
                "${bit5}${bit1*(n-5)}"
                break
            case 9:
                "${bit1}${bit10}"
        }
    }
    /**
     * the recursive handler for getRoman
     * prepends getRomanHandler with remain/10 and log10+1 to getRomanChunk(remain%10, log10)
     * @param remain the number to convert
     * @param log10 starts with 0, and increment each time we go to the next power of 10
     * @return
     */
    private String getRomanHandler(Integer remain, Integer log10){
        if (remain == 0){
            return ''
        }
        def digit = remain % 10
        Integer next = remain /10
        return getRomanHandler(next, log10+1)+getRomanChunk(digit, log10)
    }
    def getRoman(def myNumber) {
        getRomanHandler(myNumber, 0)
    }
}
