const add = function (FractionOne, FractionTwo) {
    return FractionOne + FractionTwo;
};

describe('Fraction', () => {

const fractionPairs = [
    { fraction1: 0, fraction2: 0, expectedResult: 0},
    { fraction1: 0, fraction2: 1, expectedResult: 1},
    { fraction1: 4, fraction2: 5, expectedResult: 9}
]

    fractionPairs.forEach(fractionPair => {
        it(`${fractionPair.fraction1} + ${fractionPair.fraction2} should return ${fractionPair.expectedResult}`, () => {
            expect(add(fractionPair.fraction1, fractionPair.fraction2)).toBe(fractionPair.expectedResult);
        })
    })
});