package adapter;

public class AdapterReprodutorAudioWAV implements ReprodutorAudio {
    private ReprodutorAudioAvancado reprodutorWAV;
    
    public AdapterReprodutorAudioWAV(String arquivo) {
        this.reprodutorWAV = new ReprodutorAudioWAV(arquivo);
    }
    
    @Override
    public void reproduzir() {
        reprodutorWAV.reproduzirWAV();
    }
    
}
