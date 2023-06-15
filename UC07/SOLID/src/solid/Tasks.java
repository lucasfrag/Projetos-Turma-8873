package solid;

// Opend-closed Principle = Princípio Aberto-Fechado
public abstract class Tasks {
    public abstract void rememberTask();
}

public class createLoginScreen extends Tasks {
    String description;
    String wireframe;
    String date;
    
    public void rememberTask() {
        // Lógica do "lembrete de tarefas
        return date + description + wireframe;
    }
}