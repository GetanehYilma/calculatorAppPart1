import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculator extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Addition");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        try{

        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String num3 = req.getParameter("num3");
        String num4 = req.getParameter("num4");
            int a = Integer.valueOf(num1);
            int b = Integer.valueOf(num2);
            int c = Integer.valueOf(num3);
            int d = Integer.valueOf(num4);
            int sum = a + b;
            int product = c * d;

            out.print("<html><head><title>Result</title></head><body>");
            out.println("<h4>The result will be: </h4><br>");
        out.println("<p>" + a + " + " + b + " = " + sum + "</p>");
//        out.println("<br>");
        out.println("<p>" + c + " * " + d + " = " + product + "</p>");
            out.print("</body></html>");

        } catch (Exception e){
            out.println("Invalid Input");
        }

//        out.println("<form action="calculate" method="post" ");

    }

}
