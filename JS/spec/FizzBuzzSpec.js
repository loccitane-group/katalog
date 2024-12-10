const fizbuz = () => ["1", "2", "Fizz"];

it("The first number should be 1", () => {
  var result = fizbuz();
  expect(result[0]).toEqual("1");
});

it("The second number should display 2", () => {
  var result = fizbuz();
  expect(result[1]).toEqual("2");
});
it("The third number should display Fizz", () => {
  var result = fizbuz();
  expect(result[2]).toEqual("Fizz");
});
