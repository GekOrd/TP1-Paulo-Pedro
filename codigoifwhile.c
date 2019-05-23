#include <stdio.h>

int main() {

	printf("Digite um numero de 1 a 5:");

	int x;

	scanf("%d",&x);

	

	if(x==1){

		printf("olá");

	}

	if(x==2){

		printf("olá");

	}

            if(x==3){

		printf("olá");

	}

           if(x==4){

		printf("olá");

	}

           if(x==5){

		printf("olá");

	}

		

	while(x<1||x>5){

		printf("*Numero invalido*\nDigite novamente:");

	scanf("%d,",&x);

	}

	return 0;

}
