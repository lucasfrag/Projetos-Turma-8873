package adapter;

public class ReprodutorAudioMP3 implements ReprodutorAudio {
    private String arquivo;
    
    public ReprodutorAudioMP3(String arquivo) {
        this.arquivo = arquivo;
    }
    
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo arquivo MP3: " + arquivo);
    }
}
