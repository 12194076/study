import java.util.Scanner;

//v0.3 차이점 : 가독성이 좋아진 버전 int 빼고 t/f 인식하는 불린사용
public class ReviewDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        boolean isPrime = true; //is는 비동사라서 참 거짓을 나타낸다 ex: he is 학생 -> 교수니까 노노
                for (int k = 2; k < number; k++) { // 1과 같다를 제거했으니 0이 유지되면 소수인 것
            if (number % k == 0)//입력된 수를 k로 나누었을 떄 나머지가 0인경우 증, 약수
               // cnt++; //카운트가 1일때와 자기수일때만 증가하니까 카운트가 2인 경우 소수이고 3이상이면 소수 x
isPrime = false; // 위 트루가 유지되면 소수인거고 한번이라도 나누어떨어지면 펄스로 바뀌는 것
                    //카운트는 대입과 증감연산 cnt = cnt + 1 즉 불린을 하면 대입연산만 쓰니까 가벼워진다
                }
       // if (cnt == 0) //카운트가 0이 유지되면 true
       // if (isPrime == true) // isPrime 변수 값이 true면으로 해석되고 더 줄일 수 있다.

        if(isPrime)
            System.out.println(number + "은(는) 소수!");
        else
            System.out.println(number + "은(는) 소수가 아닙니다!");
    }
}

//import java.util.Scanner;
//
//v0.2 차이점 : 반복횟수 감소 k=1 k<=number 에서 k=2 k<nummer 즉 반복 횟수 2회 감소
//
//public class ReviewDemo01 {
//    public static void main(String[] args) {
//        // 소수 : 1과 자기자신외에는 나누어 떨어지지 않는 수
//        //Q : 입력값 확인 후 소수 판정 알고리즘 만들고 소수 여부를 출력하는 문제!
//       Scanner sc = new Scanner(System.in); //키보드 입력을 받기 위해 sc 객체를 통해 입력
//        int number = sc.nextInt();
//      /* n.I를 이용해서 정수값을 입력받은 수를 반복문을 돌려서 1 나눠주고 2나눠주고 소수 찾기
//        이후 if문을 f로 만들어서 카운트값을 증가시키지 않는 방식으로 나누어지는 소수가 2번이면 소수 아니면 소수가 아니다 판정 */
//     int cnt = 0; // 카운트를 저장할 변수 지정 0으로 시작
//
//        for (int k = 2; k < number; k++) { // 1과 같다를 제거했으니 0이 유지되면 소수인 것
//           if (number % k == 0)
//                cnt++; //카운트가 1일때와 자기수일때만 증가하니까 카운트가 2인 경우 소수이고 3이상이면 소수 x
//        }
//       if (cnt == 0) //카운트가 0이 유지되면 true
//           System.out.println(number + "은(는) 소수!");
//        else
//            System.out.println(number + "은(는) 소수가 아닙니다!");
//    }
//}

//import java.util.Scanner;
//v0.1
//
//public class ReviewDemo01 {
//    public static void main(String[] args) {
//        // 소수 : 1과 자기자신외에는 나누어 떨어지지 않는 수
//        //Q : 입력값 확인 후 소수 판정 알고리즘 만들고 소수 여부를 출력하는 문제!
//
//        Scanner sc = new Scanner(System.in); //키보드 입력을 받기 위해 sc 객체를 통해 입력
//        int number = sc.nextInt();
//        /* n.I를 이용해서 정수값을 입력받은 수를 반복문을 돌려서 1 나눠주고 2나눠주고 소수 찾기
//        이후 if문을 f로 만들어서 카운트값을 증가시키지 않는 방식으로 나누어지는 소수가 2번이면 소수 아니면 소수가 아니다 판정
//         */
//        int cnt = 0; // 카운트를 저장할 변수 지정 0으로 시작
//
//        for (int k = 1; k <= number; k++) {//와일문을 사용해도 상관 없다. 입력받은 수가 저장되어있는 nummber를 비교
//            if (number % k == 0)
//                cnt++; //카운트가 1일때와 자기수일때만 증가하니까 카운트가 2인 경우 소수이고 3이상이면 소수 x
//        }
//        if (cnt == 2)
//            System.out.println(number + "은(는) 소수!");
//        else
//            System.out.println(number + "은(는) 소수가 아닙니다!");
//    }
//} //알트+쉬프트+에프10 눌러서 실행

