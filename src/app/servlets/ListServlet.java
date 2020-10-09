package app.servlets;

import app.model.Models;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "list")
public class ListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Models model = Models.getInstance();
            List<String> names = model.list();
            req.setAttribute("userNames", names);

            RequestDispatcher requestDispatcher = req.getRequestDispatcher("list.jsp");
            requestDispatcher.forward(req, resp);
        }catch (Exception e){
            System.out.println(e + " Something is wrong");
        }

    }
}
