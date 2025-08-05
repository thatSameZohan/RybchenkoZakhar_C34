import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.util.Objects;

@WebFilter(urlPatterns = "/admins")
public class AdminFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String role=servletRequest.getParameter("role");

        if(!Objects.equals(role, "ADMIN")){
            throw new ServletException("no access");
        }

        filterChain.doFilter(servletRequest,servletResponse);
    }


}
