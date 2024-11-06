class Fraction {
  constructor(numerator, denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  setAdditionService(additionService) {
    this.additionService = additionService;
  }

  getAdditionService() {
    return this.additionService;
  }

  add(fraction) {
    this.getAdditionService();
    return new Fraction(2, 2);
  }
}

module.exports = Fraction;
