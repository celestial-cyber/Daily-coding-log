

int main(){
    short int si =1;

    switch(++si-si++){
        case 1L:
        printf("case 1 executed");
        break;

        case 2L:
        printf("case 2 executed");
        break;

        default:
        printf("Default block executed");
        break;
    }
    return 0;
}



