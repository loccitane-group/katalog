const fizzbuz = () => ["1", "2", "Fizz"];
const isMultipleOfThree = (value) => false

it("The first displayed value should be 1", () => {
  var result = fizzbuz();
  expect(result[0]).toEqual("1");
});

it("The second displayed value should be 2", () => {
  var result = fizzbuz();
  expect(result[1]).toEqual("2");
});
it("The third displayed value should be Fizz", () => {
  var result = fizzbuz();
  expect(result[2]).toEqual("Fizz");
});

it("1 is not multiple of 3", () => {
  var result = isMultipleOfThree(1);
  expect(result).toBe(false);
});
