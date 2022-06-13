package main;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Instant;

@Data
@ConfigurationProperties(prefix = "first")
public class FirstProperties {

    private String value;

    public static void main(String[] args) {

        System.out.println(Instant.now().toString());
    }
}
