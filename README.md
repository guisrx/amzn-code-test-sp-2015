# AMZN Coding Test SP 2015 #

This project is a resolution of the Amazon code test for SP - 2015.

## Problem definition ##

### QUESTION  A ###

**Coding exercise:**
Find the last repeated word in a stream.  Please note that you are being provided a stream as a source for the characters. The stream is guaranteed to eventually terminate (i.e. return false from a call to the next() method), though it could be very long.  You will access this stream through the provided interface methods.  A call to hasNext() will return whether the stream contains any more characters to process.  A call to next() will return the next character to be processed in the stream.  It is not possible to restart the stream.

**Example 1:**
* Input:  The angry dog was red. And the cat was angry too.
* Output: “angry”

In this example, the last repeated word is “angry”.

**Example 2:**
* Input: The angry dog was red.
* Output: “”

In this example, there is no repeated word.


Use the following skeleton for your solutions.

```java
package questions;

public interface Stream {
    char next();

    boolean hasNext();
}

public class QuestionA {
    public static String lastRepeated(final Stream input) {
// YOUR CODE
    }
}
```

### QUESTION B ###

**Coding exercise:**
You received a cake as a gift, which every layer has a different flavor. Each flavor has a value, which represents how much you like it. The higher value, the more you like it. You can eat the cake from the top to the bottom, from the bottom to the top, both or you can decide to do not eat anything. You don’t need to eat all layers. Create an application that receives as input an array of Integers where each position represents one cake layer from the top to the bottom. As output you will need to return the sum of layers values that you will eat in order to maximize your pleasure of eating the cake. 

**Example 1:**

* Input: [10, -2, 5, -4, 3, -5, 1]
* Output: 14 

In the first example you would eat the layers 0, 1, 2 and 6, so the result would be 10 + (-2) + 5 + 1 = 14.

**Example 2:**

* Input: [-1, -5, -7, 9, 10, 8]
* Output: 27

In the second example you would eat the layers 5, 4 and 3, so the result would be 8 + 10 + 9 = 27.

**Example 3:**
* Input: [-1, -2, 1, -7]
* Output: 0

In the third example you will not eat anything since in any case you will not like the cake.

Use the following skeleton for your solutions.

```java
package questions;

public class QuestionB {
    public static Integer cake(final int[] input) {
        // YOUR CODE
    }
}
```

### Design ###

* Problem A: Concatenate chars until word delimiter is found. Then store the found and the already found words in a set with access O(1) and also verify if this word was already added.
* Problem B: Generates all the possibilities top -> bottom and bottom -> top. Evaluates if the possibility is valid and then evaluates its value. Outputs the highest value found for a valid possibility. Improvement: generate only valid possibilities changing the iterations indexes and use dynamic programming to not have to calculate possibilities already evaluated.

### Dependencies ###

* Java JDK version 1.7
* JUnit version 4.11
* Maven version 2.2
* Maven Compiler Plugin version 3.3

