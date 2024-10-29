const add = function (FractionOne, FractionTwo) {
    const frac1 = FractionOne.toString();
    const frac2 = FractionTwo.toString();

    const msgError = [];

    if (frac1.includes("4") || frac2.includes("4")) {
        msgError.push("4 is not allowed in fraction");
    };

    if (!isFinite(FractionOne) || !isFinite(FractionTwo)) {
        msgError.push("Warning handsome, divide by 0 is forbidden!");
    }
    
    if (msgError.length == 0) {
        return FractionOne + FractionTwo;
    } else {
        return msgError;
    }
    
};

describe("Fraction", () => {
  const fractionPairs = [
    { fraction1: 0, fraction2: 0, expectedResult: 0 },
    { fraction1: 0, fraction2: 1, expectedResult: 1 },
    { fraction1: 4, fraction2: 5, expectedResult: ["4 is not allowed in fraction"] },
  ];

  fractionPairs.forEach((fractionPair) => {
    it(`${fractionPair.fraction1} + ${fractionPair.fraction2} should return ${fractionPair.expectedResult}`, () => {
      expect(add(fractionPair.fraction1, fractionPair.fraction2)).toEqual(fractionPair.expectedResult);
    });
  });

  it("Sum of two 1/2 fractions that should be equal 1/1", function () {
    expect(add(1 / 2, 1 / 2)).toBe(1 / 1);
  });

  it("Sum of two fractions 1/4 and 2/4 that should be equal 3/4", function () {
    expect(add("1 / 4", 2 / 4)).toContain("4 is not allowed in fraction");
  });

  it("Sum of two fractions 1/4 and 2/8 that should be equal 2/4", function () {
    expect(add("1 / 4", 2 / 8)).toContain("4 is not allowed in fraction");
  });

  it("Sum of two fractions 1/4 and 2/8 that should be equal 1/2", function () {
    expect(add("1 / 4", 2 / 8)).toContain("4 is not allowed in fraction");
  });

  it('Sum of two fractions 1/4 and 1/0 that should be equal "Warning handsome, divide by 0 is forbidden!"', function () {
    const sumResult = add("1 / 4", "1 / 0");
    expect(sumResult).toContain("4 is not allowed in fraction");
    expect(sumResult).toContain("Warning handsome, divide by 0 is forbidden!");
  });

  it('Sum of two fractions 1/4 and 1/0 that should be equal "Warning handsome, divide by 0 is forbidden!"', function () {
    expect(add("1 / 0", "1 / 4")).toEqual(["4 is not allowed in fraction", "Warning handsome, divide by 0 is forbidden!"]);
  });

    it('the value 4 is forbidden into fraction', function () {
        expect(add("1/4", "1/4")).toContain("4 is not allowed in fraction");
    });
});
