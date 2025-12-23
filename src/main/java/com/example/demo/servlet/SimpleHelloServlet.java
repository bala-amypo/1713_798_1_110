package com.example.demo.servlet;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/hello")
public class SimpleHelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest r,HttpServletResponse s) throws IOException{
        s.setStatus(200);
        s.getWriter().write("OK");
    }
}
