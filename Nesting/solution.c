int solution(char *S) {
    if(strlen(S)==0) {
        return 1;
    }
    int counter = 0;
    while(*S!='\0') {
        if(*S++=='(') {
            counter++;
        } else {
            counter--;
        }
        if(counter<0) {
            return 0;
        }
    }
    return counter==0;
}
