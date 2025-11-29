package com.example;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContactServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String message = req.getParameter("message");

        // Simple validation
        if (name == null || name.isEmpty() ||
            email == null || email.isEmpty() ||
            message == null || message.isEmpty()) {
            req.setAttribute("error", "All fields are required!");
            RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
            dispatcher.forward(req, resp);
            return;
        }

        // Pass data to JSP
        req.setAttribute("name", name);
        req.setAttribute("email", email);
        req.setAttribute("message", message);

        RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
        dispatcher.forward(req, resp);
    }
}