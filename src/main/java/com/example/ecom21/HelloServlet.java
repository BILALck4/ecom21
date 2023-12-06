package com.example.ecom21;

import java.io.*;

import com.example.ecom21.entities.Utilisateur;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

    }
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jcg-JPA");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("Chandan");
        em.persist(utilisateur);
        em.getTransaction().commit();
    }

    public void destroy() {
    }
}