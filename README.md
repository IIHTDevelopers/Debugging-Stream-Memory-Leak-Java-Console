### Scenario
A batch job that parses large CSV files shows ever‑increasing heap usage and triggers **OutOfMemoryError** after a few runs.

### Objective
Identify the memory leak and fix the resource‑handling issue.


#### Steps to Reproduce
1. Compile with `mvn clean package`.
2. Run unit tests or invoke main method to observe failure.
