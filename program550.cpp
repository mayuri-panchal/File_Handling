#include<stdio.h>
#include<stdlib.h>

int main()
{
    // conditional preprocessing
    #ifdef _WIN32
        system("cls");
    #else
        system("clear");
    #endif
    
    return 0;
}