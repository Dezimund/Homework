package Hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static void main(String[] args) throws IOException {



        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input Error like - HTTPS_40* ");

        error arg = error.valueOf(bufferedReader.readLine());


        switch (arg){
            case HTTP_400 -> System.out.println("400 Bad Request response status code indicates that the server cannot or will not process the request due to something that is perceived to be a client error");
            case HTTP_401 -> System.out.println("401 Unauthorized response status code indicates that the client request has not been completed because it lacks valid authentication credentials for the requested resource.");
            case HTTP_402 -> System.out.println("402 Payment Required is a nonstandard response status code that is reserved for future use. This status code was created to enable digital cash or (micro) payment systems and would indicate that the requested content is not available until the client makes a payment.");
            case HTTP_403 -> System.out.println("403 Forbidden response status code indicates that the server understands the request but refuses to authorize it.");
            case HTTP_404 -> System.out.println("404 Not Found response status code indicates that the server cannot find the requested resource.");
            case HTTP_405 -> System.out.println("405 Method Not Allowed response status code indicates that the server knows the request method, but the target resource doesn't support this method.");
            case HTTP_406 -> System.out.println("406 Not Acceptable client error response code indicates that the server cannot produce a response matching the list of acceptable values defined in the request's proactive content negotiation headers, and that the server is unwilling to supply a default representation.");
        }





    }

    public enum error{
        HTTP_400,
        HTTP_401,
        HTTP_402,
        HTTP_403,
        HTTP_404,
        HTTP_405,
        HTTP_406
    }



    }




