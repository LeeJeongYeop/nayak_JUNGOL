import java.util.Scanner;

public class J1620 {
    // 문자열 번호 더미
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputPhone = s.next();
        int sumNum = s.nextInt();   // 더할 값
        int selectNum = s.nextInt();  // 더미 선택 값
        String[] outputPhone = inputPhone.split("-");  // 번호 더미 분할

        if (sumNum > 9 || sumNum < 1){  // 1~9까지의 더할 값 제한
            System.out.println("INPUT ERROR!");
            System.exit(1);
        }
        if (outputPhone.length < selectNum){  // 넘어가는 인덱스에 대한 예외 처리
            for (int i=0; i<4; i++)
                System.out.print(sumNum);
            System.exit(1);
        }
        for(int i=0; i<outputPhone.length; i++){
            if(outputPhone[i].length() > 4){  // 번호 더미 4자리 초과 값 처리
                System.out.println("INPUT ERROR!");
                System.exit(1);
            }
            if(outputPhone[i].length() < 4){  // 번호 더미 4자리 미만 값 처리
                while (outputPhone[i].length() < 4){
                    outputPhone[i] = "0"+outputPhone[i];
                }
            }
        }
        String result = "";
        selectNum--;   // 더미 선택 값과 인덱스 맞춤
        for(int i=0; i<=3; i++){
            int temp = (outputPhone[selectNum].charAt(i)-'0') + sumNum;
            if(temp > 9){
                temp = temp - 10;
            }
            result = result + String.valueOf(temp);
        }
        s.close();
        System.out.println(result);
    }
}
