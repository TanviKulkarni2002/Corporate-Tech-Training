## Problem Statement: Find all twin prime numbers less than a given positive number. ##

**Given a positive number, find all twin prime numbers less than a given positive number **

**This exercise should be completed by writing unit test cases. Create the following classes under the package com.stackroute.unittesting inside test folder:**


    TwinPrimesTests
        -Should check findTwinPrimes method for positive number less than 100
        -Should check findTwinPrimes method for positive number greater than 100 
        -Should check findTwinPrimes method does not return null
        -Should check isPrime method for prime numbers
        -Should check isPrime method for non prime numbers
        -Should check isPrime method does not return null
------------------------------------------------------
    TwinPrimesAppTests
        -Should check inputValidator method prints error message "Please give proper positive number not negative number" if input is negative number 
        -Should check inputValidator method prints error message "Please give proper positive number not zero" if input is zero
        -Should check findTwinPrimes method with input prints the result or not 

## Example
    Sample Input:
    10
    
    Expected Output:   
    {(3,5),(5,7)}
--------------------------------------------------------
    Sample Input:
    0
    
    Expected Output:
    Please give proper positive number not zero
--------------------------------------------------------
    Sample Input:
    -20
    
    Expected Output:
    Please give proper positive number not negative number

## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding