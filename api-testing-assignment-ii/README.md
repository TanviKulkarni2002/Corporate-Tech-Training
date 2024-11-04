# API Testing with Postman

## Objective
The goal of this assignment is to familiarize learners with API testing using Postman. Students will learn how to perform various HTTP request types, handle request headers, parameters, and authentication, organize requests into collections, manage variables using environments, write test scripts in JavaScript for response validation and status code checks, and run automated tests using Postman.

## Instructions

### Task 1: Building and Sending Requests
- Create a new request in Postman for each of the following endpoints:
    1. **GET** https://jsonplaceholder.typicode.com/posts
    2. **GET** https://jsonplaceholder.typicode.com/posts/1
    3. **GET** https://jsonplaceholder.typicode.com/posts/1/comments
    4. **GET** https://jsonplaceholder.typicode.com/comments?postId=1
    5. **POST** https://jsonplaceholder.typicode.com/posts
    6. **PUT** https://jsonplaceholder.typicode.com/posts/1
    7. **PATCH** https://jsonplaceholder.typicode.com/posts/1
    8. **DELETE** https://jsonplaceholder.typicode.com/posts/1

- For each request, make sure to:
    - Set the appropriate request type (GET, POST, PUT, PATCH, DELETE).
    - Handle request headers (e.g., Content-Type, Authorization if needed).
    - Include any necessary parameters in the request.

### Task 2: Organizing Requests into Collections
- Organize the requests you've created in Task 1 into a Postman collection named "JSONPlaceholder API Testing." Ensure that the requests are ordered logically within the collection.

### Task 3: Using Environments for Variable Management
- Create a Postman environment called "JSONPlaceholder Environment."
- Define the following variables in the environment:
    - `baseURL` with the value `https://jsonplaceholder.typicode.com`
    - `postId` with a random number (for use in Task 4).
- Associate the "JSONPlaceholder Environment" with your collection.

### Task 4: Writing Test Scripts
- For each request in the collection, write a test script using JavaScript that does the following:
    - Validates the response status code (e.g., 200 for a successful request).
    - Performs specific response validation based on the request type. For example, for GET requests, validate the response structure.

### Task 5: Running Automated Tests
- Use the Postman Collection Runner to execute the entire collection.
- Ensure that all tests pass successfully. If any test fails, review and debug the request, headers, or scripts to resolve the issues.

## Submission
Provide the following for your submission:
1. A screenshot of your Postman workspace with the "JSONPlaceholder API Testing" collection and associated environment visible.
2. A screenshot showing the results of running the collection using the Postman Collection Runner.
3. A brief report summarizing the results, highlighting any issues you encountered and how you resolved them.



