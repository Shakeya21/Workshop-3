package pl.coderslab.jeeusercrud.users;

import pl.coderslab.jeeusercrud.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserList", value = "/user/list")
public class UserList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao uDao = new UserDao();
        request.setAttribute("users", uDao.findAll());
        getServletContext().getRequestDispatcher("/users/list.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}