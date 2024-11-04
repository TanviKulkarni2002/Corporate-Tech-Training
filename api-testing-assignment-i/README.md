# API Testing Assignment

## Objective

The objective of this assignment is to familiarize learners with API testing using Postman. You will explore various HTTP methods, understand status codes, and examine request and response structures.

## Prerequisites

Before starting this assignment, ensure that learners have a basic understanding of HTTP, RESTful APIs, and Postman. They should have Postman installed and set up on their machines.

## Task 1: Introduction to Postman

- In this task, you will set up Postman and explore its interface.
- Create a new collection named "API Testing Assignment."
- Create a new environment named "API Environment."

## Task 2: Sending GET Requests

- Using the collection created in Task 1, add requests for the following endpoints:
  - GET [https://jsonplaceholder.typicode.com/posts](https://jsonplaceholder.typicode.com/posts)
  - GET [https://jsonplaceholder.typicode.com/posts/1](https://jsonplaceholder.typicode.com/posts/1)
  - GET [https://jsonplaceholder.typicode.com/posts/1/comments](https://jsonplaceholder.typicode.com/posts/1/comments)
  - GET [https://jsonplaceholder.typicode.com/comments?postId=1](https://jsonplaceholder.typicode.com/comments?postId=1)
- In each request, include the required headers and parameters.
- Execute the requests and examine the responses.
- Document the status codes and response structures.

## Task 3: Sending POST Request

- Add a new request to the collection to make a POST request to [https://jsonplaceholder.typicode.com/posts](https://jsonplaceholder.typicode.com/posts).
- Include necessary headers and request body with sample data (e.g., title and body).
- Execute the request and observe the status code and the response structure.
- Ensure the request was successful and the new resource was created.

## Task 4: Sending PUT Request

- Add a new request to the collection to make a PUT request to [https://jsonplaceholder.typicode.com/posts/1](https://jsonplaceholder.typicode.com/posts/1).
- Include necessary headers and request body with updated data.
- Execute the request and observe the status code and the response structure.
- Ensure the request was successful and the resource was updated.

## Task 5: Sending PATCH Request

- Add a new request to the collection to make a PATCH request to [https://jsonplaceholder.typicode.com/posts/1](https://jsonplaceholder.typicode.com/posts/1).
- Include necessary headers and request body with partial data for updating.
- Execute the request and observe the status code and the response structure.
- Ensure the request was successful and the resource was partially updated.

## Task 6: Sending DELETE Request

- Add a new request to the collection to make a DELETE request to [https://jsonplaceholder.typicode.com/posts/1](https://jsonplaceholder.typicode.com/posts/1).
- Include the required headers.
- Execute the request and observe the status code.
- Ensure the request was successful and the resource was deleted.

## Task 7: Analysis and Documentation

- Create a document summarizing your findings for each task.
- For each request, document the HTTP method, status code, request headers, request body (if applicable), and response body.
- Explain what each status code means (e.g., 200, 201, 400, 404, 500).
- Include screenshots from Postman to illustrate your findings.

## Submission

Learners should submit their Postman collection and environment files along with the document containing their analysis and documentation.

## Assessment Criteria

- Correct implementation of requests and handling of HTTP methods.
- Accurate understanding and explanation of status codes.
- Comprehensive analysis and documentation of each request.
- Correct submission of Postman collection and environment files.



