
const isMultipleOfThree = (value) => value % 3 === 0;
const isMultipleOfFive = (value) => value % 5 === 0;

it("1 is not multiple of 3", () => {
  var result = isMultipleOfThree(1);
  expect(result).toBe(false);
});

it("3 is multiple of 3", () => {
  var result = isMultipleOfThree(3);
  expect(result).toBe(true);
});

it("3 is not multiple of 5", () => {
  var result = isMultipleOfFive(3);
  expect(result).toBe(false);
});

it("5 is multiple of 5", () => {
  var result = isMultipleOfFive(5);
  expect(result).toBe(true);
});
const fizzbuzz = (input) => "Fizz"
it("multiple of 3 should display Fizz", () => {
    var result = fizzbuzz(3);
    expect(result).toEqual("Fizz");
  });

  it("not multiple of 3 and not multiple of 5 should display the value", () => {
    var result = fizzbuzz(1);
    expect(result).toEqual("1");
  });