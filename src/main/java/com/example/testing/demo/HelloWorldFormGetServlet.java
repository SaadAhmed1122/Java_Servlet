package com.example.testing.demo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldFormGetServlet", value = "/HelloWorldFormGetServlet")
public class HelloWorldFormGetServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // set the MIME media type of the response
        res.setContentType("text/html; charset=utf-8");

        // get a stream to write the response
        PrintWriter out = res.getWriter();

        // get the name to say hello
        String name = req.getParameter("helloName");

        // write the HTML page
        out.printf("<!DOCTYPE html>%n");

        out.printf("<html lang=\"en\">%n");
        out.printf("<head>%n");
        out.printf("<meta charset=\"utf-8\">%n");
        out.printf("<title>HelloWorld Form Get Servlet Response</title>%n");
        out.printf("</head>%n");

        out.printf("<body>%n");
        out.printf("<h1>HelloWorld Form Get Servlet Response</h1>%n");
        out.printf("<hr/>%n");
        out.printf("<p>%n");
        out.printf("Hello, %s!%n", name);
        out.printf("</p>%n");
        out.printf("</body>%n");

        out.printf("</html>%n");

        // flush the output stream buffer
        out.flush();

        // close the output stream
        out.close();

    }


}
