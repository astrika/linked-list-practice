# Author: Astrid Manuel
# Date: January 27, 2017
# Algorithm Practice
Data Structures first assignment - Analysis of binary search, for loop size and linear search

Folder contains solutions for three problems and analysis of algorithms:
# Problem 1:
Contains the program logic for determining whether
 a given integer is in an array containing a strictly increasing sequence
 followed by a decreasing sequence.
 
 Running Time: O(log n)
 
 T(n) = 2logn + C
 
 Because two binary searches were used to search through 2 sub arrays, the complexity
 of this algorithm is log n.
 
# To compile and run:
javac ProblemOne.java

java ProblemOne
 
# Problem 2:
 Given an array, returns its balance index (any) or -1
 if no balance index exists.

 Running Time: O(n)
 
 T(n) = 2n + C

Because two for loops are run, each of complexity n (given their size), the
 complexity of this algorithm is O(n)
 
# To compile and run:
javac ProblemTwo.java

java ProblemTwo

# Problem 3:
Given a sorted array with possible duplicate elements,
 a value k is checked for number of occurences.
 
 Running Time: O(n)
 
 T(n) = n + C
 
 Because linear search is done with one for loop, of complexity n (given its size), the
 complexity of this algorithm is O(n)

# To compile and run:
javac ProblemThree.java

java ProblemThree
