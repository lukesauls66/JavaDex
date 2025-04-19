package com.example.pokedex.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvConfig {

    public EnvConfig() {
        Dotenv dotenv = Dotenv.load();
        String mongoUri = dotenv.get("MONGODB_URI");

        // Set the Mongo URI as a system environment variable
        System.setProperty("MONGODB_URI", mongoUri);
    }
}
