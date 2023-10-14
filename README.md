# TC-ID-Verifier REST API

The TC-ID-Verifier REST API is a Java Spring Boot application that validates Turkish ID numbers. It accepts a Turkish ID number as input and provides an HTTP response code, query date, and response time based on the validity of the ID number.

## Features
- Validates Turkish ID numbers according to predefined rules.
- Returns HTTP status code 200 for a valid ID and 422 for an invalid ID.
- Includes detailed response information, such as query date and response time.

## Usage
To verify a Turkish ID number, send a GET request to the following endpoint:

GET /api/verify/{tc}


- Replace `{tc}` with the Turkish ID number you want to verify.

### Response
The API response includes the following details:

- `code`: The HTTP status code. `200` indicates a valid ID, while `422` indicates an invalid ID.
- `queryDate`: The timestamp of the request.
- `responseTime`: The processing time in seconds.

## Example Request

GET /api/verify/17889073249

## Example Response (Valid ID)

HTTP/1.1 200 OK
{
"code": 200,
"queryDate": "2023-10-14T20:26:38.723+00:00",
"responseTime": 0.0085
}



## Installation and Setup
1. Clone the repository to your local machine.
2. Run the application using Spring Boot tools or `mvn spring-boot:run`.
3. Send GET requests to the provided endpoint to verify Turkish ID numbers.

Please feel free to use or contribute to this open-source project. If you encounter any issues or have suggestions for improvements, don't hesitate to open an issue or create a pull request.

