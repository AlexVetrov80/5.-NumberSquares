package ru.netology.sqr;

public class SQRService {
    public int numberSquares(int bottomLine, int highLine) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if  (i * i >= bottomLine && i * i <= highLine) {
                counter++;
            }
        }
        return counter;
    }
}










