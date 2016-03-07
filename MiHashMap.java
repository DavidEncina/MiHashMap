import java.util.Arrays;

/**
 * Write a description of class MiHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashMap
{
    // Almacena elementos clave de tipo String
    private String claves[];
    //  Almacena elementos valor de tipo int   
    private int valores[];

    /**
     * Constructor for objects of class MiHashMap
     */
    public MiHashMap()
    {
        claves = new String[0];
        valores = new int[0];
    }

    /**
     * Asocia el valor especificado con la clave especificada.
     * Si la clave existía, entonces sobreescribe su valor y devuelve el valor antiguo. Si no existía devuelve -1.
     */
    public int put(String clave, int valor)
    {
        int v = -1;
        if (claves.length >= 0 && valores.length >= 0) {
            claves = new String[claves.length + 1];
            valores = new int[valores.length + 1];
            claves[0] = clave;
            valores[0] = valor;
            v = valor;
        }        
        else {
            for (int i = 0; i < claves.length; i++) {
                if (claves[i].equals(clave)) {
                    int valorAntiguo = valores[i];
                    valores[i] = valor;
                    v = valorAntiguo;
                }
            }
        }
        return v;
    }
    
    /**
     * 
     */
    public int get(String clave)
    {
        int devolver = -1;
        for(int i = 0; i < valores.length; i++)
        {
            String claveTemporal = claves[i]; 
            if(claveTemporal == clave)
            {
                devolver = valores[i];
            }
        }
        return devolver; 
    }
}
