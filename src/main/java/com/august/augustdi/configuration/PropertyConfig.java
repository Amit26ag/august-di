package com.august.augustdi.configuration;

import com.august.augustdi.domain.MusicProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:mymusic.properties")
public class PropertyConfig {

    @Value("${music.site}")
    String musicSite;

    @Value("${music.username}")
    String username;

    @Value("${music.password}")
    String password;

    @Bean
    public MusicProvider musicProvider() {
        MusicProvider musicProvider = new MusicProvider();

        musicProvider.setMusicSite(musicSite);
        musicProvider.setUsername(username);
        musicProvider.setPassword(password);
        System.out.println(musicProvider);
        return musicProvider;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        return new PropertySourcesPlaceholderConfigurer();
    }

}
