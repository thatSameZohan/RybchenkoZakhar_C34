package org.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class ServletConfiguration implements WebApplicationInitializer {

    @Override
    public void onStartup(jakarta.servlet.ServletContext servletContext) {

        var context = new AnnotationConfigWebApplicationContext();
        context.scan("org.spring");

        var dispatcherServlet = new DispatcherServlet(context);

        var dispatcher = servletContext.addServlet("dispatcher", dispatcherServlet);

        dispatcher
                .addMapping("/");
    }

}
