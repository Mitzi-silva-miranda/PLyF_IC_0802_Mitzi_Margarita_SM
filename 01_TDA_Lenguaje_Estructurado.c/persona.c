#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

typedef struct{
	char nombre[10];
	char apellidos[15];
	int edad;
	char genero[2];
}Persona;

void comer();
void caminar ();
void dormir ();
void hablar();

int main(){
	system("Cls");
	char nombre[10];
	char apellidos[15];
	int edad;
	char genero[2];
	Persona e;
	printf("introduzca su nombre: \n");
	scanf("%s",&nombre);
    printf("introduzca sus apellidos: \n");
	scanf("%s",&apellidos);
    printf("introduzca su edad: \n");
	scanf("%d",&edad);
	printf("introduzca su genero:\n");
	scanf("%s",&genero);
	printf("hola %s, que esta haciendo\n",nombre);
		comer();	
		caminar();	
		hablar();	
		dormir();
	return 0;
}
void comer(){
printf("estoy comiendo\n");
return;
}
void caminar(){
printf("estoy cominando\n");
return;
}
void hablar(){
printf("estoy hablando\n");
return;
}
void dormir(){
printf("estoy durmiendo\n");
return;
}