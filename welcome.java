import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpSession;
import java.sql.*;

import javax.sql.*;
public class welcome extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{

            PrintWriter output=res.getWriter();
            output.println("dfhjhfjh");
            // HttpSession hs=req.getSession(false);
            // if(hs!=null){
            //     String nm=hs.getAttribute("username").toString();
            //     output.println("<h1>welcome "+nm+" </h1>");
            
            // Date d=(Date)hs.getAttribute("date");
            // if(d!=null){
            // output.println("<h6> "+d+" </h6>");
            // output.println("<br><a href=logout>logout</a>");
            // }
            // else{
            //     output.println("login required");
            //     output.println("<br><a href=login.html>login</a>");
            // }
        }
       
    
}
}
