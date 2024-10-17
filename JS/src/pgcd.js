const pgcd = (a, b) => {
  if (b) {
    return pgcd(b, a % b);
  } else {
    return Math.abs(a);
  }
};

module.exports = pgcd;
