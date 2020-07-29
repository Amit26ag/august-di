package com.august.augustdi.domain;

public class MusicProvider {

    private String musicSite;

    private String username;

    private String password;

    public String getMusicSite() {
        return musicSite;
    }

    public void setMusicSite(String musicSite) {
        this.musicSite = musicSite;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MusicProvider{" +
                "musicSite='" + musicSite + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
