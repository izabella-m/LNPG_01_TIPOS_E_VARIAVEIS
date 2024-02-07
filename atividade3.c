#include <stdio.h>

int main() {
    float t_celsius, t_fahrenheit;

    printf("digite a temperatura em c°: ");
    scanf("%f", &t_celsius);

    t_fahrenheit = (t_celsius * 9 / 5) + 32;

    printf("%.2f graus celsius são%.2f graus farenheit.\n", t_celsius, t_fahrenheit);

    return 0;
}