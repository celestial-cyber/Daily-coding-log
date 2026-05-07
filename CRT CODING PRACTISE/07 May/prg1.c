

int main() {

    int n;
    scanf("%d", &n);

    int arr[n];

    int total = 0;
    int leftsum = 0;

    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        total += arr[i];
    }

    int found = 0;

    for (int i = 0; i < n; i++) {

        int rightsum = total - leftsum - arr[i];

        if (leftsum == rightsum) {
            printf("%d", i);
            found = 1;
            break;
        }

        leftsum += arr[i];
    }

    if (found == 0) {
        printf("-1");
    }

    return 0;
}