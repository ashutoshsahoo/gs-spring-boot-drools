# Spring Boot with Drools Rule Engine and Fetch from external API

## Use case

Provided
the student id and marks, application will calculate grade and fetches student details( name and email) from external
API.

## Test Application

* Request

```shell
curl --location 'http://localhost:8080/drools/v1/rules/calculateResult' \
--header 'Content-Type: application/json' \
--data '{
    "studentId": 1,
    "marksheet": [
        {
            "subject": "MATHS",
            "marks": 80,
            "totalMarks": 100
        },
        {
            "subject": "SCIENCE",
            "marks": 80,
            "totalMarks": 100
        }
    ]
}'
```

* Response

```json
{
  "grade": "A",
  "marksObtained": 160,
  "total": 200,
  "percentage": 80.0,
  "student": {
    "id": 1,
    "name": "ABC XYZ",
    "email": "abc@gmail.com"
  }
}
```