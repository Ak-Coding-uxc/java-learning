# Java Programs Repository

## Description
This repository contains clean, beginner-friendly Java console programs organized into a professional project structure. Shared logic is placed in reusable utility classes, and runnable learning exercises are separated into an `examples` area.

## Features
- Organized directory structure (`src`, `examples`, `notes`, `assets`)
- Reusable utility classes for math and array operations
- Interactive examples for:
  - factorial calculation
  - multiplication table generation
  - maximum element in array
  - element search in array
- Cleaner naming and consistent formatting

## Technologies Used
- Java (JDK 8+ compatible)
- Standard Java libraries (`java.util`)

## Project Structure
- `src/main/java/com/example/javaprograms/utils/` → reusable source code
- `examples/java/com/example/javaprograms/examples/` → practice and demo programs
- `notes/` → theory and revision notes
- `assets/` → static files such as images

## How to Run
From the project root:

```bash
mkdir -p out
javac -d out $(find src examples -name "*.java")
```

Run any example class:

```bash
java -cp out com.example.javaprograms.examples.factorial_example
java -cp out com.example.javaprograms.examples.multiplication_table_example
java -cp out com.example.javaprograms.examples.array_analysis_example
```

## Output Section
Sample output for factorial program:

```text
Enter a non-negative number: 5
Factorial of 5 is 120
```

Sample output for multiplication table program:

```text
Enter a number: 3
3 x 1 = 3
3 x 2 = 6
...
3 x 10 = 30
```

Sample output for array analysis program:

```text
Enter value for index[0]: 8
Enter value for index[1]: 2
Enter value for index[2]: 14
Enter value for index[3]: 1
Enter value for index[4]: 9
The maximum element is 14
Enter element to search: 9
9 is found in array
```
