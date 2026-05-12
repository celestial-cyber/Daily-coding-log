//#include <stdio.h>
//#include <string.h>

int main() {
    char s[101];
    int count = 0;

    scanf("%s", s);

    int len = strlen(s);

    for (int i = 0; i < len; i++) {

        // Check if character is 'b'
        if (s[i] == 'b') {

            for (int j = i + 1; j <= len; j++) {

                // Print substring
                for (int k = i; k < j; k++) {
                    printf("%c", s[k]);
                }

                printf("\n");
                count++;
            }
        }
    }

    printf("Count = %d\n", count);

    return 0;
}