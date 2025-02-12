package controller;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TestServletTest {

    @Test
    void doGet() throws ServletException, IOException {
        HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = Mockito.mock(HttpServletResponse.class);

        Mockito.when(request.getParameter("answer")).thenReturn("1");

        TestServlet servlet = new TestServlet();
        servlet.doGet(request, response);

        Mockito.verify(response).setStatus(HttpServletResponse.SC_OK);
    }

}