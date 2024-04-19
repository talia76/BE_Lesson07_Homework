import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/servlet")
public class OurAnotherServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String servletName = request.getParameter("name");
        response.getWriter();

        HttpSession session = request.getSession(true);
        session.setAttribute("name", servletName);

        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Our another Servlet name</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Our Servlet's name is " + servletName + "</h1>");
        writer.println("</body>");
        writer.println("</html>");
        writer.close();
    }
}
