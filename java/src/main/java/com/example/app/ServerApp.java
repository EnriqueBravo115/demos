package com.example.app;

import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import org.eclipse.jetty.ee10.servlet.ServletHolder;
import org.eclipse.jetty.server.Server;

import com.example.app.servlet.HelloServlet;

public class ServerApp {
    public static void startApp() throws Exception {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        server.setHandler(context);
        context.addServlet(new ServletHolder(new HelloServlet()), "/hello");

        server.start();
    }
}
