#include<stdio.h>
	int main (){
		int a, b;
		printf("Digite dois númeiros inteiros: \n");
		scanf("%d %d", &a, &b);
		if(a > b){
            for(int i = b; i <= a; i++){
                if((i % 1) == 0 && i % i) == 0){
                    printf("%d \n", i);
                }
		    }
		}else{
            for(int i = a; i <= b; i++){
                if((i % 1) == 0 && i % i) == 0){
                    printf("%d \n", i);
                }
		    }
		}
		return 0;
	}

