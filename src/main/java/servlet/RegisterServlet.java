package servlet;

import model.User;
import repository.UserRepository;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Console;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        if(!login.equals("") && !email.equals("") && !password.equals("")) {
            if (!password.equals(confirmPassword)) {
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("register.jsp");
                String errorMessage = "Podane hasła nie są zgodne!";
                req.setAttribute("error", errorMessage);
                requestDispatcher.forward(req, resp);
            }
            else {
                User user = new User(login, email, password);
                UserRepository.addUser(user);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("success.jsp");
                requestDispatcher.forward(req, resp);
            }
        }
        else{
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("register.jsp");
            String errorMessage = "Pola nie mogą pozostać puste!";
            req.setAttribute("error", errorMessage);
            requestDispatcher.forward(req, resp);
        }
    }
}
