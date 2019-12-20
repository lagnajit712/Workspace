package com.java.Af;

public class Solution3 {
    private static final int MAXIMUM_SEAT_ROWS = 50;
    private static final int MAXIMUM_RESERVER_SEAT_LENGTH = 1909;

    enum SEAT {
        A, B, C, D, E, F, G, H, J, K
    }

    private static final String[] seats = {"A", "B", "C", "D", "E", "F", "G", "H", "J", "K"};

    public int solution(int N, String S) {
        //2D array where 1 indicates reserved & 0 as empty
        int allSeats[][] = new int[N][10];
        int count = 0;
        boolean empty = true;

        if (N > MAXIMUM_SEAT_ROWS || (!S.isEmpty() && S.length() > MAXIMUM_RESERVER_SEAT_LENGTH))
            return 0;
        String[] reservedSeats = S.split(" ");
        int row = 0, column = 0;
        for (String s : reservedSeats) {
            char columnCharacter=0;
            if(s.length()>2){
                columnCharacter = s.charAt(2);
                row = Integer.valueOf(s.substring(0, 2));
            }else {
                columnCharacter = s.charAt(1);
                row = Integer.valueOf(s.substring(0, 1));
            }
            String val = Character.toString(columnCharacter);
            column = SEAT.valueOf(val).ordinal();

            allSeats[row-1][column] = 1;
            row = 0;
            column = 0;
        }
        System.out.println(java.util.Arrays.asList(SEAT.values()));
        //Display reserve seats
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < 10; c++) {
                 System.out.print(c==0?"Row"+r+"\t"+allSeats[r][c] + "\t":allSeats[r][c] + "\t"); }
            System.out.println();
        }

        //for each row find the consecutive 4 seats vacant
        for ( row = 0; row < N; row++) {

            //Case 1 check for middle rows DEFG
            for (column = 3; column < 7; column++) {
                if (allSeats[row][column] == 1) {
                    empty = false;
                    break;
                }
            }
            if (empty)

                count += 1;
                empty=true;


            //Case 2 check for middle rows BCDE
            for (column = 1; column < 5; column++) {
                if (allSeats[row][column] == 1) {
                    empty = false;
                    break;
                }
            }
            if (empty)
                count += 1;
                empty=true;


            //Case 3 check for middle rows FGHJ
            for (column = 5; column < 9; column++) {
                if (allSeats[row][column] == 1) {
                    empty = false;
                    break;
                }
            }
            if (empty)
                count += 1;
                empty=true;

            column=0;
            System.out.println(" Row " + row+" completed with count as "+ count);
            count=0;
        }
        return count;
    }
}
