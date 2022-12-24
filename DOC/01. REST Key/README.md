# REST Key – CodeXam
Example with Explanation

In a REST API, resources are pieces of data or objects that you want to expose to the outside world through your application. The resources that you choose to expose in your API will depend on the needs of your clients and the functionality that you want to provide.

For example, in a library management system, you might want to expose resources for books, journals, and other materials in the library's collection, because these are the types of data that the library's clients (e.g., patrons, librarians, etc.) are most likely to be interested in accessing. This could include information about the title, author, availability, and location of each book, as well as details about the journal's title, publisher, and subject area.

In a student management system, you might want to expose resources for student records, course information, and grades, because these are the types of data that the system's clients (e.g., students, teachers, administrators, etc.) are most likely to need. This could include information about the student's name, enrollment status, and courses they are taking, as well as details about the courses themselves, such as the course title, instructor, and meeting times.

By exposing these resources through a REST API, you can allow external clients to access and manipulate the data in your application in a standardized, flexible, and scalable way.

simple diagram that illustrates how resources can be exposed through a REST API:

`[Client] <-- HTTP request --> [API] <-- CRUD operations --> [Resource]`

In this diagram:

*   The client is a program or device that makes HTTP requests to the API.
    
*   The API is a web application that exposes resources through HTTP endpoints (i.e., URI paths that represent the resources).
    
*   The resource is a piece of data or an object that is managed by the API.
    

When the client makes an HTTP request to the API, the API processes the request and performs the appropriate CRUD (create, read, update, delete) operation on the resource. The API then returns a response to the client, which may include data from the resource or a status code indicating the result of the operation.

Here are a couple of examples of how this might work in a library management system and a student management system:

*   In a library management system, a client might make an HTTP GET request to the API's "books" endpoint to retrieve a list of books in the library's collection. The API would then perform a read operation on the "books" resource and return a list of book records to the client.
*   In a student management system, a client might make an HTTP POST request to the API's "enrollments" endpoint to create a new enrollment record for a student. The API would then perform a create operation on the "enrollments" resource and return a status code indicating the result of the operation.

Example with Explanation

Uri (Uniform Resource Identifier) is a string of characters that identify a name or a resource on the Internet. It can be broken down into two main types: URLs (Uniform Resource Locators) and URNs (Uniform Resource Names).

URLs are used to locate resources on the Internet, such as web pages, images, and videos. They specify the protocol (e.g., HTTP, HTTPS) and the domain name (e.g., [www.example.com](http://www.example.com/)) of the resource, as well as the path to the resource (e.g., /path/to/resource).

URNs are used to identify resources, but they do not specify the location of the resource. They are used to give a unique name to a resource, so that it can be referenced even if the location of the resource changes.

Here is a table that illustrates the use of URI with different HTTP methods:

*   The "GET" method is used to retrieve data from the server.
    
*   The "POST" method is used to send data to the server to create a new resource.
    
*   The "PUT" method is used to send data to the server to update an existing resource.
    
*   The "DELETE" method is used to delete a resource from the server.
    
*   In these examples, the HTTP method is specified at the beginning of each line (GET, POST, PUT, DELETE).
    
*   The URL (Uniform Resource Locator) specifies the location of the resource being accessed. In these examples, the URL is made up of several parts:
    
*   The "https://" part indicates that the request will be made over a secure connection using the HTTPS protocol.
    
*   "localhost" is the hostname of the server. This could also be an IP address or a domain name.
    
*   ":8282" is the port number. This specifies which service on the server the client is trying to access. Different services (such as a web server or a database) can listen on different port numbers.
    
*   "/students" is the URI (Uniform Resource Identifier) that specifies the path to the resource on the server. In these examples, the URI is used to identify the specific resource being accessed (e.g. a list of students or a specific student).
    
*   The "description" is a brief summary of what each request does. For example, the "GET" request for "/students" returns a list of students, while the "POST" request for "/students" creates a new student record.
    

Example with Explanation

A sub-resource is a resource that is related to or dependent on another resource. In REST (Representational State Transfer), a sub-resource is typically accessed through a URI that includes the parent resource's URI as a prefix.

For example, consider a blog writing website that has a resource for articles. Each article might have its own URI, such as "/articles/123", where "123" is the article's unique identifier. The article resource might include data such as the title, author, and body text of the article.

The article resource could also have sub-resources, such as comments or likes. These sub-resources would be related to the parent article resource, but they would have their own unique URI that includes the article's URI as a prefix. For example, the comments sub-resource for the article with the URI "/articles/123" might have a URI of "/articles/123/comments", and the likes sub-resource for the same article might have a URI of "/articles/123/likes".

Here are a couple of examples of how sub-resources might be used in a blog writing website:

*   A client might make an HTTP GET request to the "/articles/123/comments" endpoint to retrieve a list of comments for the article with the ID "123". The API would then perform a read operation on the "comments" sub-resource and return a list of comment records to the client.
    
*   A client might make an HTTP POST request to the "/articles/123/likes" endpoint to create a new like record for the article with the ID "123". The API would then perform a create operation on the "likes" sub-resource and return a status code indicating the result of the operation.
    

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/01.%20REST%20Key/1.png?raw=true)

`Syntax` : `http://localhost:8282/resource/{id}/sub-resource`

`Example` : `http://localhost:8282/articles/123/comments`

In the first example, `http://localhost:8282/resource/{id}/sub-resource` is the syntax for a URI that accesses a sub-resource of a resource. The syntax includes the following components:

*   `http` is the protocol used to transfer data over the internet.
*   `localhost` is the hostname of the server that is hosting the API.
*   `8282` is the port number on which the API is running.
*   `resource` is the name of the resource that is being accessed.
*   `{id}` is a placeholder for a unique identifier for the resource.
*   `sub-resource` is the name of the sub-resource that is being accessed.

In the second example, `http://localhost:8282/articles/123/comments/82` is an example of a URI that accesses the comments sub-resource for an article resource on a blog writing website. In this example:

*   `http` is the protocol used to transfer data over the internet.
*   `localhost` is the hostname of the server that is hosting the API.
*   `8282` is the port number on which the API is running.
*   `articles` is the name of the resource that represents articles on the website.
*   `123` is the unique identifier for the specific article being accessed.
*   `comments` is the name of the sub-resource that represents comments on the articles.
*   `82` is the unique identifier for the specific comment being accessed basically, sub-resource id.

This URI could be used by a client to make an HTTP request to the API to retrieve a list of comments for the article with the ID "123". The API would then perform a read operation on the "comments" sub-resource and return a list of comment records to the client.

Remember that sub resources can not exist without resources. So, if you want to access a sub resource, you must first access the resource that it is related to.

Example with Explanation

In HTTP (Hypertext Transfer Protocol), request methods are used to indicate the desired action to be performed on a given resource. There are several HTTP request methods that can be used, including:

*   GET: Used to retrieve a resource from the server. This is the most common HTTP request method and is used to retrieve data from the server without modifying it.
*   HEAD: Used to retrieve the headers of a resource from the server without the resource itself. This request method is similar to GET, but it does not return the resource data.
*   POST: Used to create a new resource on the server. This request method is typically used to submit data to the server, such as when creating a new article on a blog writing website.
*   PUT: Used to update an existing resource on the server. This request method is used to replace an existing resource with a new version.
*   DELETE: Used to delete a resource from the server. This request method is used to remove a resource from the server.

Here's an example of how these HTTP request methods might be used in a blog writing website:

*   A client might make an HTTP GET request to the "/articles" endpoint to retrieve a list of articles from the server.
*   A client might make an HTTP HEAD request to the "/articles/123" endpoint to retrieve the headers for the article with the ID "123" without the article data itself.
*   A client might make an HTTP POST request to the "/articles" endpoint to create a new article on the server. The request might include data such as the title, author, and body text of the article.
*   A client might make an HTTP PUT request to the "/articles/123" endpoint to update the article with the ID "123" with new data. The request might include updated data for the title, author, and body text of the article.
*   A client might make an HTTP DELETE request to the "/articles/123" endpoint to delete the article with the ID "123" from the server.

HTTP request methods are used to indicate the desired action to be performed on a given resource. When a client makes an HTTP request to a server, it specifies the request method in the request header. The server then processes the request and performs the appropriate action based on the request method.

Here's an example of how an HTTP request with a request method might be formatted:

```
POST /articles HTTP/1.1
Host: example.com
Content-Type: application/json
 
{
    "title": "My Article",
    "author": "John Doe",
    "body": "This is the body of my article."
}
```


In this example, the request method is "POST", which indicates that the client is requesting that a new resource be created on the server. The resource being created is "/articles", and the request includes data in the form of a JSON object that includes the title, author, and body text of the article.

The server processes the request and performs the appropriate action based on the request method. In this case, the server would create a new article resource with the specified data. The server would then return a response to the client, which might include a status code indicating the result of the operation.

`[Client] --POST /articles--> [Server]`

In this diagram:

*   The client is a program or device that makes HTTP requests to the server.
*   The server is a web application that hosts the API for the blog writing website. When the client makes an HTTP request to the server, it specifies the request method in the request header. The server then processes the request and performs the appropriate action based on the request method.

For example, if the client makes an HTTP POST request to the "/articles" endpoint, the server might create a new article resource with the data included in the request body. The server would then return a response to the client, which might include a status code indicating the result of the operation.

Example with Explanation

HTTP response codes are used to indicate the status of a request made to a server. Here are some examples of how different HTTP response codes might be used on a blog writing website:

*   200 OK: This status code would be used when a request to view a blog post has been successful. The server would return the requested blog post along with a 200 OK status code.
*   301 Moved Permanently: If the URL of a blog post has changed, the server might return a 301 Moved Permanently status code along with the new URL of the blog post. This tells the client (e.g. a web browser) that the blog post has been permanently moved to the new location, and any future requests for the old URL should be redirected to the new URL.
*   404 Not Found: If a client requests a blog post that does not exist, the server would return a 404 Not Found status code to indicate that the requested resource could not be found.
*   500 Internal Server Error: If there is a server-side error that prevents the server from fulfilling a request (e.g. a database error), the server might return a 500 Internal Server Error status code to indicate that something went wrong.
*   These are just a few examples of how HTTP response codes might be used on a blog writing website. There are many other status codes that could be used in different situations.