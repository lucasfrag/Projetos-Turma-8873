package adapter;

public class ReprodutorAudioWAV implements ReprodutorAudioAvancado {
    private String arquivo;
    
    public ReprodutorAudioWAV(String arquivo) {
        this.arquivo = arquivo;
    }
    
    @Override
    public void reproduzirWAV() {
        System.out.println("Reproduzindo arquivo WAV: " + arquivo);
    }
}
