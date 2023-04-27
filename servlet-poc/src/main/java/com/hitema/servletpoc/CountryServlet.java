package com.hitema.servletpoc;

import java.io.*;

import com.hitema.dao.CountryDaoImpl;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "countryServlet", value = "/countryServlet")
public class CountryServlet extends HttpServlet {
    private String message;
    private CountryDaoImpl dao = new CountryDaoImpl();

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("countries", dao.findAll());
        RequestDispatcher rd  = request.getRequestDispatcher("countries.jsp");
        rd.forward(request, response);
    }

    public void destroy() {
    }
}