const pgcd = require('./pgcd');
const OPERATION = require('./enums');

class Fraction {
  constructor(nominator, denominator) {
    this.nominator = nominator;
    this.denominator = denominator;
  }

  calculate = (fraction, operation) => {
    if (this.denominator === 0 || fraction.denominator === 0) return null;
    const denominator = this.denominator * fraction.denominator;
    let nominator;
    switch (operation) {
      case OPERATION.ADDITION:
        nominator = this.nominator * fraction.denominator + fraction.nominator * this.denominator;
        break;
      case OPERATION.MINUS:
        nominator = this.nominator * fraction.denominator - fraction.nominator * this.denominator;
        break;
    }

    const result = new Fraction(nominator, denominator);
    return result.simplify().toString();
  };

  add = (fraction) => {
    return this.calculate(fraction, OPERATION.ADDITION);
  };

  minus = (fraction) => {
    return this.calculate(fraction, OPERATION.MINUS);
  };

  simplify = () => {
    const _pgcd = pgcd(this.nominator, this.denominator);
    return new Fraction(this.nominator / _pgcd, this.denominator / _pgcd);
  };

  toString = () => {
    return this.denominator === 1 ? `${this.nominator}` : `${this.nominator}/${this.denominator}`;
  };
}

module.exports = Fraction;
