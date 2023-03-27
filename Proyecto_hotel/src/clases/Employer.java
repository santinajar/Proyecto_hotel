
package clases;
import java.util.ArrayList;

public class Employer {
    private String name;
    private String function;
    private ArrayList<Resident> residentes;
    
    public Employer(String name, String function) {
        this.name = name;
        this.function = function;
    }
    
    public Resident createResidente(String name, String mail, String idtype, int number, int id) {
        return new Resident(name, mail, idtype, number, id);
        
    }
    
    public void agregarResidente(Resident residente) {
        residentes.add(residente);
    }
    
    public void eliminarResidente(Resident residente) {
        residentes.remove(residente);
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getFunction() {
        return function;
    }
    
    public void setFunction(String function) {
        this.function = function;
    }
    public ArrayList<Resident> getResidentes() {
        return residentes;
    }
}
