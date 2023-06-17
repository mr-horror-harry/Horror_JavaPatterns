#include<stdio.h>
#include<stdlib.h>

int main()
{
    short n;
    char s[101];
    printf("Enter a number and a string: ")
    scanf("%hi %s", &n, s);
    
    short ptr=0, rCt=0, cCt, l=strlen(s);
    while(rCt++ < n){
        cCt=0;
        while(cCt++ < rCt){
            printf("%c", s[ptr++ % l]);
        }
        printf("\n");
    }
}