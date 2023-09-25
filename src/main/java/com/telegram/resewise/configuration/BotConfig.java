package com.telegram.resewise.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "telegram.bot")
@Component
@Getter
@Setter
public class BotConfig {

    private String token;
    private String name;

}
