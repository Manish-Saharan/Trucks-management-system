Creating a REST API using JAVA

I have created a REST API using Springboot that connects with MongoDB database. 
The endpoints are tested using Postman. Endpoint Responses can be found in the 'Screenshots' folder.

API Endpoints:

- GET: "/servers"
  Gets the list of all the Servers present in the Database

- POST: "/servers"
  Adds a new Server to the Database

- GET: "/server/{ID}"
  Finds a Server of given ID

- GET: "/server/{text}" 
  Finds the list of Servers having the specified keyword in their names

-Delete: "/deleteserver/{ID}"
  Deletes a Server of given ID
 