int solution(int N) {
    int i = 0;
    int n = 1;
    while(!(N & (n<<i++))) ;
    int count = 0;
    int tmp   = 0;
    for(;i<8*sizeof(int); i++) {
        if(N & (n<<i)) {
            count = tmp > count ? tmp : count;
            tmp   = 0;
        } else {
            tmp++;
        }
    }
    return count;
}
