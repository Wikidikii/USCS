public class Main {
    
    public static void main(String[] args) {
        
        TADPilha p = new TADPilha (100);
        
        int n = 10, resto;
        
        while (n != 0) {
            resto = n % 2;
            p.empilha (resto);
            n = n / 2;
        }
        
        System.out.println(" AO CONTRARIO");
        p.MostraAoContrario();
        System.out.println(" \n NORMAL");
        p.Mostra();
        System.out.println("A pilha p tem " + p.conta() + " elementos");
    }
}
