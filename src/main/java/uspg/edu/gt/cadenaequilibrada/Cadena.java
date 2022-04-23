
package uspg.edu.gt.cadenaequilibrada;

import java.io.InputStream;
import java.util.Stack;


public class Cadena {
    
    
    private String palabra;
    private Stack<Character> letras = new Stack<Character>();
    
    public Cadena(String palabra){
        
        this.palabra = palabra;
    }

    
    
    
    
    
    public boolean equilibrada(){
        char arreglo_letras[] = palabra.toCharArray();
    
        
        for (int i = 0; i <arreglo_letras.length; i++) {
            
            if (arreglo_letras[i]=='('){
                
                     letras.push('(');
            }
            else if(arreglo_letras[i]==')'){
                
                if (!letras.empty()){
                    
                    letras.pop();
                }
            }
            
        }
        
        
        return letras.empty();
    }
    
    
}