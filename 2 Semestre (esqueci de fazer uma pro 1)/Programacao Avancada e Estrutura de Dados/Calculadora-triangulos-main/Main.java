public class Main {
    public static void main (String[] args)
    {
        //Criar um Triangulo
        Triangulo t1 = new Triangulo (2,3,4);
        
        if (t1.formaTriangulo()==0) {
            System.out.println("Os valores não formam um triangulo");
        }
        else {
            System.out.println("Os valores formam um triangulo");
            t1.mostraTipo(2,3,4);
            t1.perimetro(2, 3, 4);
        }
    }
    

    
}
