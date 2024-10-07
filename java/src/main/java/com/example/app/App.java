package com.example.app;

import org.flywaydb.core.Flyway;

public class App {
    public static void main(String[] args) throws Exception {
        ServerApp.startApp();

        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:postgresql://localhost:5432/postgres",
                        "postgres", "password")
                .locations("classpath:db/migration/")
                .load();

        flyway.migrate();
    }
}
