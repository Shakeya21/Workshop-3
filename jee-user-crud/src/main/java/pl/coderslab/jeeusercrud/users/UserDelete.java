package pl.coderslab.jeeusercrud.users;

import pl.coderslab.jeeusercrud.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UserDelete", value = "/user/delete")
public class UserDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao uDao = new UserDao();
        String id = request.getParameter("id");
        try {
           int userId = Integer.parseInt(id);
            uDao.delete(userId);
            response.sendRedirect("/user/list");

        }catch (Exception e){
            System.out.println("Błąd parsowania id");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}