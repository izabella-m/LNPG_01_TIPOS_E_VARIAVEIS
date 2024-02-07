#include <stdio.h>

int main() {

  int a, b;

  printf("Digite o primeiro número:");
  scanf("%d", &a);
  printf("Digite o segundo número:");
  scanf("%d", &b);

  printf("Adição: %d + %d = %d\n", a, b, a + b);

  printf("Subtração: %d - %d = %d\n", a, b, a - b);

  printf("Multiplicação: %d * %d = %d\n", a, b, a * b);
 
  if (b != 0) {
    float divisao = (float)a / b;
    printf("Divisão: %d / %d = %.2f\n", a, b, divisao);
  } else {
    printf("Divisão por zero nao é permitida.\n");
  }
  
  return 0;
}