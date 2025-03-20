# Spring Boot with Drools Rule Engine

## Test Application

* Request
```shell
curl --location 'http://localhost:8080/drools/v1/rules/calculateResult' \
--header 'Content-Type: application/json' \
--data '{
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
  "percentage": 80.0
}
```