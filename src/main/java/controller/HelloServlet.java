package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="hello", value = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println(">>> helloServlet запустился");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        req.setAttribute("test", 123);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/test.jsp");
        requestDispatcher.forward(req, resp);

    }
}


