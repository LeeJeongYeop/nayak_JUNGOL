import java.util.Scanner;

public class J1707 {
    // 달팽이 숫자
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();

        int[][] iArr = new int[num][num];
        int sum = 1;
        for(int n=0; sum<=(num*num); n++){
            for(int i=n; i<(num-n); i++){
                iArr[n][i] = sum++;
            }
            for(int i=n; i<num-(n+1); i++){
                iArr[i+1][num-(n+1)] = sum++;
            }
            for(int i=(num-(n+2)); i>=n; i--){
                iArr[num-(n+1)][i] = sum++;
            }
            for(int i=(num-(n+2)); i>=(n+1); i--){
                iArr[i][n] = sum++;
            }
        }

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                System.out.print(iArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
