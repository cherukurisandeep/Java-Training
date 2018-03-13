package com.javatraining;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "LogFilter")
public class LogFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(true);
        if(session !=null && session.getAttribute("username")!=null){
            chain.doFilter(request,response);
            return;
        }else{
            RequestDispatcher reqdes = req.getRequestDispatcher("/login.jsp");
            System.out.println("LoginPageDebig");
            out.println("<h4><strong>Your Session has been Expired</strong></h4>");
            reqdes.forward(request,response);

        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
