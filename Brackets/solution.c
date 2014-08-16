int solution(char *S) {
    int len = strlen(S);
    if(len==0) {
        return 1;
    }
    char *stack = calloc(len, sizeof(char));
    char *top = stack;
    *top = *S++;
    while(*S!='\0') {
        if((*top=='(' && *S==')') || (*top=='[' && *S==']') || (*top=='{' && *S=='}')) {
            top--;
            S++;
        } else {
            *++top=*S++;
        }
    }
    if(*top++==*S) {
        return top==stack;
    }
    return 0;
}
