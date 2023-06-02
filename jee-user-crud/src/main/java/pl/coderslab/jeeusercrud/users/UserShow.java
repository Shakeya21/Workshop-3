package pl.coderslab.jeeusercrud.users;

import pl.coderslab.jeeusercrud.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserShow", value = "/user/show")
public class UserShow extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        int idNumber = Integer.parseInt(id);
        UserDao uDao = new UserDao();
        request.setAttribute("user", uDao.read(idNumber));
        getServletContext().getRequestDispatcher("/users/show.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}