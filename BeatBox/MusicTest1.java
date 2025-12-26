package BeatBox;

import javax.sound.midi.*;

public class MusicTest1 {
    public void play(){
        try{
        Sequencer sequencer = MidiSystem.getSequencer();
        System.out.println("We create synth");
    } catch (MidiUnavailableException ex){
        System.out.println("Unsuccess");
        ex.printStackTrace();
    } finally {
    System.out.println("We did it");
}
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
       
    }
}

