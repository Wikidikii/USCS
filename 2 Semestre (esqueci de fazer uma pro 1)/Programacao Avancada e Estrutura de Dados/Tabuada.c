#include <stdio.h>

FILE *arq;
int _quantLinhas = 80;
char _nomeArq[80] = "tabuada.txt";

void GravarArquivo () {
    int i;
    arq = fopen(_nomeArq, "w");
    fprintf(arq, "TABUADA\n\n");
    if (arq == NULL) {
        printf("Problemas na Criação do arquivo\n");
        return;
    }
    
    //Grava Linhas no arquivo
    for (i = 1; i <= _quantLinhas; i++) {
        int mult = 8 * i;
        fprintf(arq, "8 * %d = %d\n", i, mult);
    }
    fclose(arq);
}

void LerArquivo () {
    // Abre o arquivo para leitura (r)
    char linha[100], * resultado;
    int i=1;
    while(!feof(arq)) {
        resultado = fgets(linha, 100, arq);
        if (resultado) printf("Linha %d > %s", i, linha);
        i++;
    }
    fclose(arq);
}

void main()
{
    printf("\nGerando o arquivo...\n");
    GravarArquivo();
    printf("\nLendo o arquivo...\n");
    LerArquivo();
}


