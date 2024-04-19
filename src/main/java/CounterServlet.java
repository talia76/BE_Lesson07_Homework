import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet("/counter")
public class CounterServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;
        private static final AtomicInteger counter = new AtomicInteger(0);

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/plain");
            PrintWriter out = response.getWriter();

            String clientName = request.getParameter("name");
            
            int count = counter.incrementAndGet();

            // Возвращаем имя клиента и значение счетчика
            out.println("Hello, " + clientName + "!");
            out.println("You are visitor number " + count);
        }
    }
