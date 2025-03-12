# Java Programming Self Review Exercises

## Problems

### 2.3 Write statements to accomplish each of the following tasks:

a) Declare variables `c`, `thisIsAVariable`, `176354`, and `number` to be of type `int`.

b) Prompt the user to enter an integer.

c) Input an integer and assign the result to `int` variable `value`. Assume `Scanner` variable `input` can be used to read a value from the keyboard.

d) Print "This is a Java program" on one line in the command window. Use method `System.out.println`.

e) Print "This is a Java program" on two lines in the command window. The first line should end with `Java`. Use method `System.out.println`.

f) Print "This is a Java program" on two lines in the command window. The first line should end with `Java`. Use method `System.out.printf` and two `%s` format specifiers.

g) If the variable `number` is not equal to `7`, display "The variable number is not equal to 7".

---

### 2.5 Write declarations, statements, or comments that accomplish each of the following tasks:

a) State that a program will calculate the product of three integers.

b) Create a `Scanner` called `input` that reads values from the standard input.

c) Declare the variables `x`, `y`, `z`, and `result` to be of type `int`.

d) Prompt the user to enter the first integer.

e) Read the first integer from the user and store it in the variable `x`.

f) Prompt the user to enter the second integer.

g) Read the second integer from the user and store it in the variable `y`.

h) Prompt the user to enter the third integer.

i) Read the third integer from the user and store it in the variable `z`.

j) Compute the product of the three integers contained in variables `x`, `y`, and `z`, and assign the result to the variable `result`.

k) Display the message "Product is" followed by the value of the variable `result`.

---

## Answers to Problems

### 2.3

a)  

```java
int c, thisIsAVariable, q76354, number;
```
// or  

```java
int c;
int thisIsAVariable;
int q76354;
int number;
```

b)  

```java
System.out.print("Enter an integer: ");
```

c)  

```java
value = input.nextInt();
```

d)  

```java
System.out.println("This is a Java program");
```

e)  

```java
System.out.println("This is a Java\nprogram");
```

f)  

```java
System.out.printf("%s\n%s\n", "This is a Java", "program");
```

g)  

```java
if (number != 7)
    System.out.println("The variable number is not equal to 7");
```

---

### 2.3 Program
```java
package *;

import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int c, thisIsAVariable, q76354, number;
        
        System.out.print("Enter an integer: ");
        int value = input.nextInt();
        
        System.out.println("This is a Java program");
        System.out.println("This is a Java\nprogram");
        System.out.printf("%s\n%s\n", "This is a Java", "program");
        
        if (number != 7)
            System.out.println("The variable number is not equal to 7");
        
        // This line is not included in the textbook
        // close() method is for closing the Scanner; this method is necessary for larger projects and optimization
        input.close();
    }
}
```

---

### 2.5

a)  

```java
// Calculate the product of three integers
```

b)  

```java
Scanner input = new Scanner(System.in);
```

c)  

```java
int x, y, z, result;
```
// or  

```java
int x;
int y;
int z;
int result;
```

d)  

```java
System.out.print("Enter first integer: ");
```

e)  

```java
x = input.nextInt();
```

f)  

```java
System.out.print("Enter second integer: ");
```

g)  

```java
y = input.nextInt();
```

h)  

```java
System.out.print("Enter third integer: ");
```

i)  

```java
z = input.nextInt();
```

j)  

```java
result = x * y * z;
```

k)  

```java
System.out.printf("Product is %d\n", result);
```

---

### 2.6 Program
```java
package *;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x;
        int y;
        int z;
        int result;
        
        System.out.print("Enter first integer: ");
        x = input.nextInt();
        
        System.out.print("Enter second integer: ");
        y = input.nextInt();
        
        System.out.print("Enter third integer: ");
        z = input.nextInt();
        
        result = x * y * z;
        
        System.out.printf("Product is %d\n", result);
        
        // This line is not included in the textbook
        // close() method is for closing the Scanner; this method is necessary for larger projects and optimization
        input.close();
    }
}
```

