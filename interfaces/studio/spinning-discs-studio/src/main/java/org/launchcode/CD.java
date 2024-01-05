package org.launchcode;

public class CD extends Media {
    private boolean isMusicCD;


    public CD(String name,boolean isMusicCD) {
        super(name, discType:"", spinRate:"800", capacity:"700");
        this.isMusicCD = isMusicCD;
        setDiscType(isMusicCD ? "music CD" : "CD-RW");
    }
    public CD(String name){
        this(name,isMusicCD:false);
    }

    public void setMusicCD(boolean musicCD) {
        isMusicCD = musicCD;
    }

    public boolean isMusicCD() {
        return isMusicCD;
    }

    @Override
    public String toString() {
        String header = isMusicCD ? "Tracks ": "Files";
        return super.toString() +getFormattedFileList(header);
    }
}
