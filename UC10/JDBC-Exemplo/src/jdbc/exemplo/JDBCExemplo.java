package jdbc.exemplo;

import java.text.ParseException;
import java.util.ArrayList;
import jdbc.exemplo.model.BancoDados;
import jdbc.exemplo.model.Livro;
import jdbc.exemplo.model.LivroBD;

public class JDBCExemplo {

    public static void main(String[] args) {
        Livro l = LivroBD.buscarPorId(4);
        System.out.println("ID: " + l.getId() + "Titulo: " + l.getTitulo());

    }
    
}
