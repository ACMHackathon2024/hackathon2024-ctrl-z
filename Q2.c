#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "argon2.h"

struct Encryption {
    char password[100];
};

int main(){
    FILE *file;

    file = fopen("file.txt","r");
    if (file == NULL) { //Error check for cvsFile
        printf("Error: File unable to open, please check students.cvs\n");
        fclose(file);
        return 1;
    }
    
    close(file);
    return 0;
}
