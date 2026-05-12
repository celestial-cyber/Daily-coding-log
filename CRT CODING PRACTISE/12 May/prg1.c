//i#nclude <stdio.h>
//#include <string.h>

int main() {
    char s[1000];
    int count = 0;

    scanf("%s", s);

    int len = strlen(s);

    for (int i = 0; i < len; i++) {
        for (int j = i + 1; j <= len; j++) {

            // Print substring
            for (int k = i; k < j; k++) {
                printf("%c", s[k]);
            }
            printf("\n");

            count++;
        }
    }

    printf("Total Substrings = %d\n", count);

    return 0;
}