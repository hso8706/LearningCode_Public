public class GCD {
    public static void main(String[] args) {

    }
    //조건: a > b
    //유클리드 호제법
    public static int gcd(int a, int b){
        while(b!=0){
            int r = a % b;
            a= b;
            b= r;
        }
        return a; //a,b는 결국 같은 수가 된다.
    }
    //유클리드 호제법_재귀 형식
    static int GCD(int a, int b){
        if (a%b == 0) {
            return b;
        }
        return GCD(b, a % b);
    }

    //유클리드 호제법: 2개의 자연수의 최대공약수를 구하는 알고리즘
    //a를 b로 나눈 나머지가 0이 될 때, a와 b를 나누는 수가 a와 b의 최대 공약수이다.

    //*호제법 : 두 수가 서로 상대방 수를 나누어 결국 원하는 수를 얻는 알고리즘
}
