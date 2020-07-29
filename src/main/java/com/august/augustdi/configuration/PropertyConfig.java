package com.august.augustdi.configuration;

import com.august.augustdi.domain.MusicProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:mymusic.properties")
@PropertySources({
        @PropertySource("classpath:mymusic.properties"),
        @PropertySource("classpath:music2.properties")
})
public class PropertyConfig {

    @Autowired
    private Environment environment;

    @Value("${music.site}")
    String musicSite;

    // Will pick form music2.properties as it appear later in the list
    @Value("${music.username}")
    String username;

    @Value("${music.password}")
    String password;

    @Value("${Path}")
    String sysUser;

    @Value("${music.mymusic.fav.singer}")
    String favSinger;

    @Bean
    public MusicProvider musicProvider() {
        MusicProvider musicProvider = new MusicProvider();

        musicProvider.setMusicSite(musicSite);
        musicProvider.setUsername(username);
        musicProvider.setPassword(password);

        System.out.println(musicProvider);
        System.out.println(favSinger);

        String pathEnvVar = environment.getProperty("Path");
        System.out.println(String.join("\n", pathEnvVar == null ? new String[0] : pathEnvVar.split(";")));
        return musicProvider;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        return new PropertySourcesPlaceholderConfigurer();
    }

}
