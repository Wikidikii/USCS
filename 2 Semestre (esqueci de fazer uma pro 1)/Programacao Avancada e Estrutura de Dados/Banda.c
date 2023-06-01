#include <stdio.h>
#include <string.h>
#define TAMANHO 100   

typedef struct {
    char nome[20];
    char estilo[15];
    int tamanho;
    int rank;
} BANDA;

void leBanda (BANDA *v, int qt) {
  for(int i=0;i<qt;i++) {
    printf("\nNome da banda: ");   scanf("%s", v[i].nome);
    printf("Estilo musical: ");    scanf("%s", v[i].estilo);
    printf("Qt de integrantes: ") ;scanf("%d",&v[i].tamanho);
    printf("Posicao no ranking: ");scanf("%d",&v[i].rank);
  }
}

void exibeBanda (BANDA *exib, int qt) {
    for( int i=0;i <qt ; i++) {
        printf("\n\nBanda: %s",exib[i].nome);
        printf("\nEstilo: %s",exib[i].estilo);
        printf("\nIntegrantes: %d",exib[i].tamanho);
        printf("\nPosicao: %d",exib[i].rank);
    }
}

void procuraBanda (BANDA *busca, int qt) {
    char aux[50];
    int achou=0;

    printf("\nInforme o tipo de musica a buscar: ");
    scanf ("%s", aux);

    for(int i=0;i<qt;i++)    {
        if(strcmp(busca[i].estilo,aux)==0){
          achou=1;
          printf("\nBanda: %s",busca[i].nome);
        }
    }
    if(achou)  printf("\nBanda Encontrada !");
    else       printf("\nBanda Ausente !");
}

void menu () {
    BANDA v[TAMANHO];     //VETOR do tipo banda.
    int op = 0, quant=0;
    while (op != 9) {
        printf ("\n\n1. Listar Todas as Bandas");
        printf ("\n2. Pesquisar por  estilo ");
        printf ("\n3. Digitar as bandas ");
        printf ("\n4. Definir a qtde de bandas (max 100)");
        printf ("\n9. Encerrar");
        printf ("\nDigite sua opção: ");
        scanf ("%d", &op);
        if (op==1) {
             printf ("\n\nLISTAGEM DE TODAS AS BANDAS CADASTRADAS");
             exibeBanda (v,quant);
        }
        if (op==2)  procuraBanda (v,quant);
        if (op==3)  leBanda      (v,quant);
        if (op==4) {
            printf ("\n\nDigite a qtde de bandas: ");
            scanf ("%d", &quant);
        };
    }
}
int main() {
    menu();
    return 0;
}
