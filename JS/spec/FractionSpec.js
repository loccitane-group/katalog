const Fraction = require("../src/Fraction");

const add = function (FractionOne, FractionTwo) {
  const frac1 = eval(FractionOne);
  const frac2 = eval(FractionTwo);

  const msgError = [];

  if (FractionOne.includes("4") || FractionTwo.includes("4")) {
    msgError.push("4 is not allowed in fraction");
  }

  if (!isFinite(frac1) || !isFinite(frac2)) {
    msgError.push("Warning handsome, divide by 0 is forbidden!");
  }

  if (msgError.length == 0) {
    return frac1 + frac2;
  } else {
    return msgError;
  }
};

describe("Fraction", () => {
  const fractionPairs = [
    { fraction1: "0", fraction2: "0", expectedResult: 0 },
    { fraction1: "0", fraction2: "1", expectedResult: 1 },
    { fraction1: "4", fraction2: "5", expectedResult: ["4 is not allowed in fraction"] },
  ];

  fractionPairs.forEach((fractionPair) => {
    it(`${fractionPair.fraction1} + ${fractionPair.fraction2} should return ${fractionPair.expectedResult}`, () => {
      expect(add(fractionPair.fraction1, fractionPair.fraction2)).toEqual(fractionPair.expectedResult);
    });
  });

  it("Sum of two 1/2 fractions that should be equal 1/1", function () {
    const frac = new Fraction(1, 2);

    frac.setAdditionService(add);
    
    expect(frac.add(frac)).toEqual(new Fraction(2, 2));
  });

  it("Should addition service be used by the Add", function () {
    const frac = new Fraction(1, 2);

    frac.additionService = spyOn(frac, "getAdditionService");
    frac.add(frac);

    expect(frac.additionService).toHaveBeenCalled();
  });

  it("Sum of two fractions 1/4 and 2/4 that should be equal 3/4", function () {
    expect(add("1 / 4", "2 / 4")).toContain("4 is not allowed in fraction");
  });

  it("Sum of two fractions 1/4 and 2/8 that should be equal 2/4", function () {
    expect(add("1 / 4", "2 / 8")).toContain("4 is not allowed in fraction");
  });

  it("Sum of two fractions 1/4 and 2/8 that should be equal 1/2", function () {
    expect(add("1 / 4", "2 / 8")).toContain("4 is not allowed in fraction");
  });

  it('Sum of two fractions 1/4 and 1/0 that should be equal "Warning handsome, divide by 0 is forbidden!"', function () {
    const sumResult = add("1 / 4", "1 / 0");
    expect(sumResult).toContain("4 is not allowed in fraction");
    expect(sumResult).toContain("Warning handsome, divide by 0 is forbidden!");
  });

  it('Sum of two fractions 1/4 and 1/0 that should be equal "Warning handsome, divide by 0 is forbidden!"', function () {
    expect(add("1 / 0", "1 / 4")).toEqual(["4 is not allowed in fraction", "Warning handsome, divide by 0 is forbidden!"]);
  });

  it("the value 4 is forbidden into fraction", function () {
    expect(add("1/4", "1/4")).toContain("4 is not allowed in fraction");
  });

  it("Fraction should have a numerator and denominator", function () {
    const frac = new Fraction(0, 1);
    expect(frac.numerator).toBe(0);
    expect(frac.denominator).toBe(1);
  });
});
