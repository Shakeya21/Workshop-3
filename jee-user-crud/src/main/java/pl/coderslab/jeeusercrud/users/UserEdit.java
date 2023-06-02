package pl.coderslab.jeeusercrud.users;

import pl.coderslab.jeeusercrud.utils.User;
import pl.coderslab.jeeusercrud.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserEdit", value = "/user/edit")
public class UserEdit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        UserDao userDao = new UserDao();
        try {
            int userId = Integer.parseInt(id);
            User read = userDao.read(userId);
            request.setAttribute("user", read);
            getServletContext().getRequestDispatcher("/users/edit.jsp")
                    .forward(request, response);
        }catch (Exception e){
            System.out.println("Błąd parsowania");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setId(Integer.parseInt(request.getParameter("id")));
        user.setUserName(request.getParameter("userName"));
        user.setEmail(request.getParameter("userEmail"));
        user.setPassword(request.getParameter("userPassword"));

        UserDao uDao = new UserDao();
        uDao.update(user);
        response.sendRedirect("/user/list");
    }
}