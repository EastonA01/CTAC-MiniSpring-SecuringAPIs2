# CTAC-MiniSpring-SecuringAPIs2

## Running the project

- Clone the repository onto your local machine
    - This can be done by either downloading the repo as a .zip file and unpacking it or if using IntelliJ/VSCode
      into your desired directory via command line: ```gh repo clone EastonA01/CTAC-MiniSpring-SecuringAPIs2```
- Navigate to the Main class (named CtacMiniSpringSecuringApisApplication)
    - (If running through IntelliJ) you can right click the class in the project files and select "Run".
    - (Command Line Option) in the root of our project folder you can run ```mvn spring-boot:run``` if all dependencies
      are properly installed

## Testing the necessary endpoints
- Currently as the project is based off of the demo given in today's lecture. The new routes are as follows:
  - /books
    - Includes getMapping, postMapping and deleteMapping
- To test this route, the new address will be as follows:
  - ```https://localhost:8443/books/{id}```
    - Where {id} is the id number of the book you are requesting
  - To add a book add this in raw JSON:
    - ```
      {
      "id" : "1",
      "title" : "Test Title: A Tale of Two Tests",
      "author" : "Dr. Testing API Endpoints"
      }
      ```