const add = function (FractionOne, FractionTwo) {
    return FractionOne + FractionTwo;
};

describe('Fraction', () => {
    it('0 + 0 should return 0', () => {
        expect(add(0, 0)).toBe(0);
    })

    it('0 + 1 should return 1', () => {
        expect(add(0, 1)).toBe(1);
    })

    it('4 + 5 should return 9', () => {
        expect(add(4, 5)).toBe(9);
    })
});