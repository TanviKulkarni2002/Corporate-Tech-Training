# API Testing Assignment using RestAssured and TestNG

## Objective

In this assignment, you will practice API testing using RestAssured and TestNG. You will work with a set of endpoints and focus on various aspects of API testing, including building HTTP requests, specifying request headers and parameters, handling authentication, and validating responses.

## API Endpoints

1. **Get all products** - [Documentation](https://dummyjson.com/docs/products)
2. **Get a single product** - [Documentation](https://dummyjson.com/docs/products/1)
3. **Add a product** - [Documentation](https://dummyjson.com/docs/products)
4. **Update a product** - [Documentation](https://dummyjson.com/docs/products/1)
5. **Delete a product** - [Documentation](https://dummyjson.com/docs/products/1)
6. **Authentication** - [Login](https://dummyjson.com/auth/login)

## Tasks

### Task 1: Setting up Your Environment

- Ensure that you have RestAssured and TestNG installed in your development environment. If not, install them.
- Create a new Java project for this assignment.

### Task 2: Get All Products

- Write a TestNG test to make a GET request to the "Get all products" endpoint.
- Validate that the response code is 200 (OK) and the response contains a list of products.
- Verify the response content type and structure.

### Task 3: Get a Single Product

- Write a TestNG test to make a GET request to the "Get a single product" endpoint.
- Validate that the response code is 200 (OK) and the response contains the expected product.
- Use a dynamic parameter to specify the product ID in the request URL.

### Task 4: Add a Product

- Write a TestNG test to make a POST request to the "Add a product" endpoint.
- Include appropriate request headers and a JSON payload to add a new product.
- Verify that the product is successfully added by checking the response code and, if available, the newly created product ID.

### Task 5: Update a Product

- Write a TestNG test to make a PUT request to the "Update a product" endpoint.
- Include appropriate request headers and a JSON payload to update an existing product (e.g., product with ID 1).
- Verify that the product is successfully updated by checking the response code and the updated product details.

### Task 6: Delete a Product

- Write a TestNG test to make a DELETE request to the "Delete a product" endpoint.
- Include appropriate request headers to perform the deletion of a product (e.g., product with ID 1).
- Verify that the product is successfully deleted by checking the response code and confirming the absence of the product in subsequent requests.

### Task 7: Authentication

- Write a TestNG test to perform authentication by making a POST request to the "Authentication" endpoint.
- Include necessary credentials or tokens for authentication.
- Validate that the authentication is successful by checking the response code and any tokens or session details.
