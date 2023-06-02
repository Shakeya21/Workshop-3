package pl.coderslab.jeeusercrud.users;

import pl.coderslab.jeeusercrud.utils.User;
import pl.coderslab.jeeusercrud.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserAdd", value = "/user/add")
public class UserAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//      Widok jsp users/add
        getServletContext().getRequestDispatcher("/users/add.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//       Deklaracja klasy user
        User user = new User();
//        Nowy użytkownik pobrany z formularza add.jsp
        user.setUserName(request.getParameter("username"));
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));
//        Deklaracja klasy userDao
        UserDao userDao = new UserDao();
//        Dodanie nowego uzytkownika do BD
        userDao.create(user);
//        Przekierowanie do lity użytkowników
        response.sendRedirect(request.getContextPath() + "/user/list");
    }
}