import java.util.ArrayList;
import java.util.Comparator;

public class DivisorExpert {
    public static void main(String[] args) {
        ArrayList<Integer> divisorExpertArr = new ArrayList<>();
        divisorExpertArr = divisorExpert(100);
        System.out.println(divisorExpertArr);
    }
    //약수 구하기; 최적화
    public static ArrayList<Integer> divisorExpert(int num) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // 약수 중 작은 수 저장
                temp.add(i);
                if (num / i != i) { // 약수 중 큰 수 저장
                    temp.add(num / i);
                }
            }
        }
        //ex) 100: [1, 100, 2, 50, 4, 25, 5, 20, 10]
        temp.sort(Comparator.naturalOrder());
        //ex) 100: [1, 2, 4, 5, 10, 20, 25, 50, 100]
        return temp;
    }
    //소수 구하기랑 같은 원리
    //N = p x q 일 때, p랑 q는 √N을 기준으로 양쪽으로 나뉘며 반비례한다.
    //위 같은 이유로 √N 까지만 반복문을 돌려도 짝이 되는 약수까지 구할 수 있다.
}
