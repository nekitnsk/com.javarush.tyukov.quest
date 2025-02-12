package controller;

import entity.Question;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import service.TestService;

import java.io.IOException;
import java.net.InetAddress;

@WebServlet(name="test", value = "/test")
public class TestServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println(">>> TestServlet запустился");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String ipAddress = req.getRemoteAddr();
        String hostName = req.getRemoteHost();

        if(ipAddress.equals("0:0:0:0:0:0:0:1") || ipAddress.equals("127.0.0.1")) {
            InetAddress hostAddress = InetAddress.getLocalHost();
            ipAddress = hostAddress.getHostAddress();
        }

        HttpSession session = req.getSession(true);
        session.setAttribute("ipAddress", ipAddress);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/test.jsp");
        requestDispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String answer = req.getParameter("answer");

        TestService testService = new TestService();

        String page = "/test.jsp";

        if(answer.equals("final")){
            page = "/final.jsp";
        } else if(answer.equals("stop")) {
            page = "/stop.jsp";
        }else{

            Question question = testService.getQuestion(answer);

            req.setAttribute("question", question);
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher(page);
        requestDispatcher.forward(req, resp);
    }


}


