const fizzbuz = () => ["1", "2", "Fizz"];

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
