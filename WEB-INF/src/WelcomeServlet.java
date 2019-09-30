import javax.servlet.http.HttpServlet;
import javax.servlet.*;
import java.io.*;

public class WelcomeServlet extends HttpServlet{
    public void service(HttpServletRequest request,HavttpServletResponse response )throws IOException{
        PrintWriter out=response.getWriter();
        out.println("Welcome to HttpServlet");


    }
}