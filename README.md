### Scenario
A batch job that parses large CSV files shows ever‑increasing heap usage and triggers **OutOfMemoryError** after a few runs.

### Objective
Identify the memory leak and fix the resource‑handling issue.


#### Steps to Reproduce
Compile with mvn clean package.
Run unit tests to observe failure using 'mvn test'
Final objective is to make test case pass.
You can run test cases many times and refactor your code.
