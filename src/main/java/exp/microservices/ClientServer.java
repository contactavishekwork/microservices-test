package exp.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ClientServer {
    public static void main(String[] args) {
       SpringApplication.run(ClientServer.class, args);
    }
}