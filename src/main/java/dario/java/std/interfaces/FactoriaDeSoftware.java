package dario.java.std.interfaces;

import java.util.ArrayList;
import java.util.List;

public class FactoriaDeSoftware {

    private List<ProgramadorNovato> programadores;

    public FactoriaDeSoftware(List<ProgramadorNovato> programadores) {
        this.programadores = programadores;
    }    
    
    public void compilarYEjecutarProyectos() {     
      for (ProgramadorNovato programador : programadores) {
           Codigo codigo = programador.programar();
           Binario binario = codigo.compilar();
           binario.run();
       }
        
    }
    
    
    public static void main(String[] args) {
        // Generics
        List<ProgramadorNovato> programadores = new ArrayList<>();
        programadores.add(new ProgramadorJava("Juan","Pérez", 30));
        programadores.add(new ProgramadorJava("Pedro","Pérez", 30));
        programadores.add(new ProgramadorCSharp("Diego","Pérez", 30));
        programadores.add(new ProgramadorCSharp("Juanita","Pérez", 30));
        programadores.add(new ProgramadorNovato("Brian","Gomez", 30));
        programadores.add(new ProgramadorJava("Carlos","Pérez", 30));
        programadores.add(new ProgramadorCSharp("Lucila","Pérez", 30));
        programadores.add(new ProgramadorJava("Carlota","Pérez", 30));
        
        FactoriaDeSoftware factoria = new FactoriaDeSoftware(programadores);
        
        factoria.compilarYEjecutarProyectos();
                             
    }
    



    
}
