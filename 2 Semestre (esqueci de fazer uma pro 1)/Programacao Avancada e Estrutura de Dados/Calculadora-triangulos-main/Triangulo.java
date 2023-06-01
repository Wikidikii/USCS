import javafx.scene.shape.ArcTo;

import java.nio.file.AtomicMoveNotSupportedException;

public class Triangulo {

    //Atributos = Váriaveis
    int ladoa;
    int ladob;
    int ladoc;

    //Construtores (chamado no new)
    public Triangulo (int a, int b, int c)
    {
        ladoa = a;
        ladob = b;
        ladoc = c;

    }

    //Métodos = Funcionalidades
    public int formaTriangulo ()
    {
        int aux = 0;

        if(ladoa > diferenca (ladob, ladoc) &&
           ladob > diferenca (ladoa, ladoc) &&
           ladoc > diferenca (ladoa, ladob) &&
           ladoa < ladob + ladoc &&
           ladob < ladoa + ladoc &&
           ladoc < ladoa + ladob){
               aux = 1;
           }
           return aux;
        
    }
    public void mostraTipo (int a , int b ,int c)
    {
        //Equilatero (3 lados sao iguais)
        if (a==b && b==c) {
            System.out.println ("Equilatero");
        }
            
        //isoceles   (2 lados sao iguais e um diferente)
        if (a==b && b != c){
         System.out.println ("Isoceles");
        }
        else if (b==c && c != a){
         System.out.println ("Isoceles");
        }
        //Escanelo   (3 lados sao diferentes)
        if (a != b && b != c && a != c){
            System.out.println ("Escaleno");
        }
    }
    private int diferenca (int a, int b) 
    {
        int aux;
        aux = b-a;
        if (aux < 0) aux = aux + (-1);

        return aux;
      
    }
    public void perimetro(int a, int b, int c) 
    {
        int peri;
        peri = ladoa + ladob + ladoc;
        System.out.println ("Perimetro = " + peri);
        
        
    }
    
}
