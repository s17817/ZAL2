package servlet;

import model.User;
import repository.UserRepository;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if(!login.equals("") && !password.equals("")) {
            /*if(UserRepository.ifExists(login, password) != null) {*/
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
                requestDispatcher.forward(req, resp);
            /*}
             else {
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
                String errorMessage = "Podane login lub hasło są nieprawidłowe!";
                req.setAttribute("error", errorMessage);
                requestDispatcher.forward(req, resp);
            }*/
        }
        else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("login.jsp");
            String errorMessage = "Podane login lub hasło są nieprawidłowe!";
            req.setAttribute("error", errorMessage);
            requestDispatcher.forward(req, resp);
        }
    }
}