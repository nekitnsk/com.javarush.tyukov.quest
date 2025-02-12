package controller;

import entity.Answer;
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
        doGetPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGetPost(req, resp);
    }

    protected void doGetPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String ipAddress = req.getRemoteAddr();


        try {
            if (ipAddress.equals("0:0:0:0:0:0:0:1") || ipAddress.equals("127.0.0.1")) {
                InetAddress hostAddress = InetAddress.getLocalHost();
                ipAddress = hostAddress.getHostAddress();
            }
        }catch (Exception e){
            e.getStackTrace();
        }

        HttpSession session = req.getSession(true);
        Integer counterTest = session.getAttribute("counterTest") != null ? (Integer) session.getAttribute("counterTest") : 0;

        session.setAttribute("ipAddress", ipAddress);

        String answer = req.getParameter("answer");

        TestService testService = new TestService();

        String page = "/test.jsp";


            if (answer != null && answer.equals("final")) {
                page = "/final.jsp";
            } else if (answer != null && answer.equals("stop")) {
                page = "/stop.jsp";
            }else{

                if(answer != null && answer.equals("restart")) {
                    session.setAttribute("counterTest", ++counterTest);
                }
                Question question = testService.getQuestion(answer);
                Answer answer1 = question.getAnswer1();
                Answer answer2 = question.getAnswer2();
                req.setAttribute("question", question);
                req.setAttribute("answer1", answer1);
                req.setAttribute("answer2", answer2);
            }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher(page);
        requestDispatcher.forward(req, resp);
    }


}


