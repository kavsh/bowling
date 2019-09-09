package bowling.com.roll;

interface IRoll {
    char MISS = '-';
    char SPARE = '/';
    char STRIKE = 'X';

    int getScore();
}
