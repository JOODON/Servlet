package com.example.hello_sev;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!!!";
    }
    //서블릿은 요청할 코드를 만들고 응답할 코드를 만드는것

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //요청할 객체는 HttpServletRequest 이놈이고
        //응답할 코드는 HttpServletResponse 이놈이다.
        response.setContentType("text/html; charset=UTF-8");//브라우저가 응답을 받을때 이 코드는 무엇이냐라고 말하는 것
        PrintWriter out=response.getWriter();//프린트 라이터라는 객체를 받아오기 위하여 호출해줌
        out.println("<h1>1부터 10까지의 합은</h1>");
        for (int i=0; i<=10; i++){
            out.println(i+"<br>");
        }
        out.close();
    }
    public void destroy() {
    }
}