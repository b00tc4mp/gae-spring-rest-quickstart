**quickstart** for whom wish to run a spring rest api service in gae (google appengine in google cloud platform)


- **run** it, two ways

1) no gae

mvn jetty:run

2) gae

mvn appengine:devserver


- **test** it

1) simple hello world

http://localhost:8080/api/helloworld

2) say hello to...

http://localhost:8080/api/hello/put-a-name-here

3) receive a json data with a sample message from a get request

http://localhost:8080/api/hellojson/get/put-a-name-here

4) receive a json data with a sample message from a post request (need to post a json with format { "message" : "put-a-name-here" })

http://localhost:8080/api/hellojson/post


- **deploy** it in gae

1) create a new project in gae console

2) set that project id and version in appengine xml (see WEB-INF)

3) mvn appengine:update
