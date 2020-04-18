package org.pedrofactory;

public class MusicPlayer {
    private Music music;

    public MusicPlayer() {
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println(music.getSong());
    }
}
