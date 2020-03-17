package ucl.ac.uk.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/helloworldservletandjsp.def")
public class HelloWorldServletAndJSP extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // Code to use the model to process something would go here.

        // Then forward to JSP.
        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/helloworld.jsp");
        dispatch.forward(request, response);
    }
}