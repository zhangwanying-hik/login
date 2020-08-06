package com.hik.test;
import javax.servlet.http.*;
import java.io.*;

public class Login extends HttpServlet{

    public void doPost(HttpServletRequest req,HttpServletResponse resp){
        String username = req.getParameter("username");
        try {
            resp.serContentType("text/html");
            PrintWriter writer = resp.getWriter();
            writer.println("<H1>Thank you," + username + "</H1>");
            writer.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


}