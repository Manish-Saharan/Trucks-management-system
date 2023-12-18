Creating a REST API application using JAVA

I have created a REST API using Springboot that connects with MongoDB database. 
The endpoints are tested using Postman.

API Endpoints:

- GET: "/servers"
  Gets the list of all the Trucks present in the Database

- POST: "/servers"
  Adds a new Truck to the Database

- GET: "/server/{ID}"
  Finds a Truck of given ID

- GET: "/server/{text}" 
  Finds the list of Trucks having the specified keyword in their Driver names

-Delete: "/deleteserver/{ID}"
  Deletes a Truck of given ID
 