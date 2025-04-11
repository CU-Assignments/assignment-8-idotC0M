import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Login Result</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; padding: 40px; text-align: center; }");
        out.println(".message-box { background: white; padding: 30px; margin: auto; display: inline-block; border-radius: 10px; box-shadow: 0 0 15px rgba(0,0,0,0.2); }");
        out.println("h2 { color: green; }");
        out.println("h3 { color: red; }");
        out.println("a { display: inline-block; margin-top: 20px; text-decoration: none; color: #007BFF; }");
        out.println("</style>");
        out.println("</head><body>");

        out.println("<div class='message-box'>");

        if ("Twfiq".equals(username) && "1234".equals(password)) {
            out.println("<h2>Welcome, " + username + "!</h2>");
        } else {
            out.println("<h3>Login failed. Invalid username or password.</h3>");
            out.println("<a href='login.html'>Try Again</a>");
        }

        out.println("</div>");
        out.println("</body></html>");

        out.close();
    }
}
