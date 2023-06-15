package adapter;

public class Adapter {
    public static void main(String[] args) {
        ReprodutorAudio reprodutorMP3 = new ReprodutorAudioMP3("musica.mp3");
        reprodutorMP3.reproduzir();
        
        ReprodutorAudio reprodutorWAV = new AdapterReprodutorAudioWAV("musica.wav");
        reprodutorWAV.reproduzir();
    }
    
}
