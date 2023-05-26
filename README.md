
# reactive_vs_blocking


In this project, I familiarized myself with reactive programming and conducted a comparison between a Servlet-based API and a WebFlux-based API.

Within the project, there is a straightforward endpoint that performs the addition of two numbers, with each operation being delayed by 10 seconds.

To evaluate the performance, I executed both reactive and blocking applications using identical code and measured the execution time for 1000 requests.



## Execution comparison

#### Reactive endpoint localhost:8080

```http
  GET /api/v1/calculate?value1=1&value2=4
```

| Parameter | Value     |              
| :-------- | :------- |
| execution time | `18.sec` |
| used threads | `35` |
| used memory | `47.mb` |


#### Blocking endpoint localhost:8081

```http
  GET /api/v1/calculate?value1=1&value2=4
```

| Parameter | Value     |              
| :-------- | :------- |
| execution time | `58.sec` |
| used threads | `227` |
| used memory | `77.mb` |


## Mesurment tools

Jmeter,
Jconsole

