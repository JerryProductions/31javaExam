# Java Programming Self Review Exercises

## Problems

### 4.5 Write a Java statement to accomplish each of the following tasks:

a) Declare variables `sum` and `x` to be of type `int`.

b) Assign `1` to variable `x`.

c) Assign `0` to variable `sum`.

d) Add variable `x` to variable `sum`, and assign the result to variable `sum`.

e) Print `"The sum is: "`, followed by the value of variable `sum`.

---

### 4.6 Combine the statements that you wrote in Exercise 4.5 into a Java application that calculates and prints the sum of the integers from 1 to 10.  
Use a `while` statement to loop through the calculation and increment statements. The loop should terminate when the value of `x` becomes `11`.

---

## Answers to Problems

### 4.5

a)

```java
int sum, x;
```  
// or  
```java
int sum;
int x;
```

b)
  
```java
x = 1;
```

c)
  
```java
sum = 0;
```

d)
  
```java
sum = sum + x;
```

e)
 
```java
System.out.println("The sum is: " + sum);
```

---

### 4.5 Program

```java
public class Calculate {
    public static void main(String[] args) {
        int sum;
        int x;
        
        x = 1;
        sum = 0;
        
        while (x <= 10) {
            sum = sum + x;
            x = x + 1;
        }
        
        System.out.println("The sum is: " + sum);
    }
}
```