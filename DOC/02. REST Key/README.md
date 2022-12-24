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
    

![example](https://github.com/Subham-Maity/CodeXam_Blog_Backend/blob/main/DOC/02.%20REST%20Key/1.png?raw=true)

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

List of HTTP Status Codes

| Status codes | Description |
| --- | --- |
| 100 Continue | The server has received the request headers, and the client should proceed to send the request body (in the case of a request for which a body needs to be sent; for example, a POST request). Sending a large request body to a server after a request has been rejected for inappropriate headers would be inefficient. To have a server check the request's headers, a client must send Expect: 100-continue as a header in its initial request and receive a 100 Continue status code in response before sending the body. If the client receives an error code such as 403 (Forbidden) or 405 (Method Not Allowed) then it shouldn't send the request's body. The response 417 Expectation Failed indicates that the request should be repeated without the Expect header as it indicates that the server doesn't support expectations (this is the case, for example, of HTTP/1.0 servers). |
| 101 Switching Protocols | The requester has asked the server to switch protocols and the server has agreed to do so. |
| 102 Processing | A WebDAV request may contain many sub-requests involving file operations, requiring a long time to complete the request. This code indicates that the server has received and is processing the request, but no response is available yet. This prevents the client from timing out and assuming the request was lost. |
| 103 Early Hints | Used to return some response headers before final HTTP message. |
| 200 OK | The request was successful. |
| 201 Created | The request was successful and a new resource was created. |
| 202 Accepted | The request was accepted for processing, but the processing has not been completed. |
| 203 Non-Authoritative Information | The request was successful but the enclosed payload has been modified from that of the origin server's 200 (OK) response by a transforming proxy. |
| 204 No Content | The request was successful but there was no data to return. |
| 205 Reset Content | The request was successful but there was no data to return, and the client should reset the document view which caused the request to be sent. |
| 206 Partial Content | The server is delivering only part of the resource due to a range header sent by the client. |
| 207 Multi-Status | A Multi-Status response conveys information about multiple resources in situations where multiple status codes might be appropriate. |
| 208 Already Reported | Used inside a DAV: propstat response element to avoid repeatedly enumerating the internal members of multiple bindings to the same collection. |
| 226 IM Used | The server has fulfilled a GET request for the resource, and the response is a representation of the result of one or more instance-manipulations applied to the current instance. |
| 300 Multiple Choices | The request has more than one possible response. The user-agent or user should choose one of them. There is no standardized way of choosing one of the responses. |
| 301 Moved Permanently | The URL of the requested resource has been changed permanently. The new URL is given in the response. |
| 302 Found | This response code means that the URI of requested resource has been changed temporarily. Further changes in the URI might be made in the future. Therefore, this same URI should be used by the client in future requests. |
| 303 See Other | The server sent this response to direct the client to get the requested resource at another URI with a GET request. |
| 304 Not Modified | This is used for caching purposes. It tells the client that the response has not been modified, so the client can continue to use the same cached version of the response. |
| 305 Use Proxy | Defined in a previous version of the HTTP specification to indicate that a requested response must be accessed by a proxy. It has been deprecated due to security concerns regarding in-band configuration of a proxy. |
| 306 Switch Proxy | No longer used. Originally meant "Subsequent requests should use the specified proxy." |
| 307 Temporary Redirect | The request and all future requests should be repeated using another URI. 307 and 308 parallel the behaviors of 302 and 301, but do not allow the HTTP method to change. So, for example, submitting a form to a permanently redirected resource may continue smoothly. |
| 308 Permanent Redirect | The request and all future requests should be repeated using another URI. 307 and 308 parallel the behaviors of 302 and 301, but do not allow the HTTP method to change. So, for example, submitting a form to a permanently redirected resource may continue smoothly. |
| 400 Bad Request | The request was invalid or cannot be otherwise served. An accompanying error message will explain further. |
| 401 Unauthorized | Authentication credentials were missing or incorrect. |
| 402 Payment Required | Reserved for future use. |
| 403 Forbidden | The request is understood, but it has been refused or access is not allowed. |
| 404 Not Found | The URI requested is invalid or the resource requested, such as a user, does not exists. |
| 405 Method Not Allowed | The request method is known by the server but has been disabled and cannot be used. |
| 406 Not Acceptable | The request is understood, but it has been refused or access is not allowed. |
| 407 Proxy Authentication Required | The client must first authenticate itself with the proxy. |
| 408 Request Timeout | The server timed out waiting for the request. According to HTTP specifications: "The client did not produce a request within the time that the server was prepared to wait. The client MAY repeat the request without modifications at any later time." |
| 409 Conflict | Indicates that the request could not be processed because of conflict in the request, such as an edit conflict in the case of multiple updates. |
| 410 Gone | The URI requested is no longer available and has been permanently removed. |
| 411 Length Required | The request did not specify the length of its content, which is required by the requested resource. |
| 412 Precondition Failed | The server does not meet one of the preconditions that the requester put on the request. |
| 413 Payload Too Large | The request is larger than the server is willing or able to process. |
| 414 URI Too Long | The URI provided was too long for the server to process. |
| 415 Unsupported Media Type | The request entity has a media type which the server or resource does not support. |
| 416 Range Not Satisfiable | The client has asked for a portion of the file, but the server cannot supply that portion. |
| 417 Expectation Failed | The server cannot meet the requirements of the Expect request-header field. |
| 418 I'm a teapot | The HTCPCP server is a teapot. This code was defined in 1998 as one of the traditional IETF April Fools' jokes, in RFC 2324, Hyper Text Coffee Pot Control Protocol, and is not expected to be implemented by actual HTTP servers. |
| 421 Misdirected Request | The request was directed at a server that is not able to produce a response. |
| 422 Unprocessable Entity | The request was well-formed but was unable to be followed due to semantic errors. |
| 423 Locked | The resource that is being accessed is locked. |
| 424 Failed Dependency | The request failed due to failure of a previous request. |
| 425 Too Early | Indicates that the server is unwilling to risk processing a request that might be replayed. |
| 426 Upgrade Required | The client should switch to a different protocol such as TLS/1.0, given in the Upgrade header field. |
| 428 Precondition Required | The origin server requires the request to be conditional. |
| 429 Too Many Requests | The user has sent too many requests in a given amount of time. |
| 431 Request Header Fields Too Large | The server is unwilling to process the request because either an individual header field, or all the header fields collectively, are too large. |
| 451 Unavailable For Legal Reasons | A server operator has received a legal demand to deny access to a resource or to a set of resources that includes the requested resource. |
| 500 Internal Server Error | A generic error message, given when an unexpected condition was encountered and no more specific message is suitable. |
| 501 Not Implemented | The server either does not recognize the request method, or it lacks the ability to fulfill the request. |
| 502 Bad Gateway | The server was acting as a gateway or proxy and received an invalid response from the upstream server. |
| 503 Service Unavailable | The server is currently unavailable (because it is overloaded or down for maintenance). Generally, this is a temporary state. |
| 504 Gateway Timeout | The server was acting as a gateway or proxy and did not receive a timely response from the upstream server. |
| 505 HTTP Version Not Supported | The server does not support the HTTP protocol version used in the request. |
| 506 Variant Also Negotiates | Transparent content negotiation for the request results in a circular reference. |
| 507 Insufficient Storage | The server is unable to store the representation needed to complete the request. |
| 508 Loop Detected | The server detected an infinite loop while processing the request. |
| 510 Not Extended | Further extensions to the request are required for the server to fulfill it. |
| 511 Network Authentication Required | The client needs to authenticate to gain network access. |
| 520 Unknown Error | The 520 error is used as a "catch-all response for when the origin server returns something unexpected", listing connection resets, large headers, and empty or invalid responses as common triggers. |
| 521 Web Server Is Down | The 521 error is used as a "catch-all response for when the origin server refuses the connection" or is unreachable, commonly due to a connection timeout. |
| 522 Connection Timed Out | The 522 error is used as a "catch-all response for when the origin server returns a slow-to-send response or no response at all", particularly during periods of high load. |
| 523 Origin Is Unreachable | The 523 error is used as a "catch-all response for when the origin server is unreachable or the request times out". |
| 524 A Timeout Occurred | The 524 error is used as a "catch-all response for when the origin server returns a timeout or "unknown connection closed" error". |
| 525 SSL Handshake Failed | The 525 error is used as a "catch-all response for when the SSL handshake fails". |
| 526 Invalid SSL Certificate | The 526 error is used as a "catch-all response for when the SSL certificate is invalid". |
| 527 Railgun Error | The 527 error is used as a "catch-all response for when the origin server returns a 5xx error code". |
| 530 Origin DNS Error | The 530 error is used as a "catch-all response for when the origin DNS server cannot be reached". |
| 561 Unauthorized | An error around authentication returned by a server registered with a load balancer. You configured a listener rule to authenticate users, but the identity provider (IdP) returned an error code when authenticating the user |
| 598 Network read timeout error | This status code is not specified in any RFCs, but is used by some HTTP proxies to signal a network read timeout behind the proxy to a client in front of the proxy. |
| 599 Network connect timeout error | This status code is not specified in any RFCs, but is used by some HTTP proxies to signal a network connect timeout behind the proxy to a client in front of the proxy. |
| 1000 Internal Server Error | A generic error message, given when an unexpected condition was encountered and no more specific message is suitable. |
