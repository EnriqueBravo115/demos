package com.example.app.servlet;

import org.eclipse.jetty.ee10.servlet.ServletContextHandler;
import org.eclipse.jetty.ee10.servlet.ServletHolder;
import org.eclipse.jetty.server.Server;
import org.flywaydb.core.Flyway;

public class ServerApp {
    public static void startApp() throws Exception {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        server.setHandler(context);
        context.addServlet(new ServletHolder(new HelloServlet()), "/hello");

        server.start();

        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:postgresql://localhost:5432/postgres",
                        "postgres", "password")
                .locations("classpath:db/migration/")
                .load();

        flyway.migrate();
    }
}
