public class TADPilha {
    
    //Atributos
    int dados[];
    int topo;
    int capacidade;
    
    //Construtor
    public TADPilha (int c) {
        capacidade = c;
        topo = -1;
        dados = new int [capacidade];
    }
    
    //Metodos
    public boolean empilha(int x) {
        if (!cheia()) {
            System.out.print("CHEIO");
            topo++;
            dados[topo] = x;
            return true;
            
        }
        return false;
        
        if (vazia()) {
            System.out.print("VAZIO");
        }
        else return false;
    }
    
    public void MostraAoContrario() {
        for (int i = topo; i >= 0; i--) {
            System.out.print(dados[i]);
        }
    }
    
    public void Mostra() {
        for (int i = 0; i <= topo; i++) {
            System.out.print(dados[i]);
        }
    }
    
    public boolean cheia() {
        return (topo == capacidade - 1);
    }
    
    public boolean vazia() {
        return (topo == -1);
    }
    
    public int conta() {
        return topo+1;
    }
}
