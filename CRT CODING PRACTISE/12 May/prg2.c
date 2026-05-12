//#include <stdio.h>
//#include <string.h>

int main() {
    char s[101];

    //fgets(s, sizeof(s), stdin);

    // Remove newline if present
    s[strcspn(s, "\n")] = '\0';

    int len = strlen(s);

    if (len == 0) {
        printf("String is Empty\n");
        return 0;
    }

    int count = 0;

    for (int i = 0; i < len; i++) {
        for (int j = i + 3; j <= len; j++) {

            for (int k = i; k < j; k++) {
                printf("%c", s[k]);
            }
            printf("\n");

            count++;
        }
    }

    if (count == 0) {
        printf("No substring length > 2\n");
    }

    printf("Count = %d\n", count);

    return 0;
}