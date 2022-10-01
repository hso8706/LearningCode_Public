public class IsPrimeExpert {
    public static void main(String[] args) {

    }
    public static boolean isPrimeExpert(int num) {
        if(num < 2) {
            return false;
        }
        // 제곱근 함수 : Math.sqrt()
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    // N = p x q ( 1 <= p,q <= N)
    // p가 증가하면 q는 감소하고, q가 증가하면 p가 감소한다.
    // 위의 내용을 종합하면 p와 q는 √N을 기준으로 영역을 나눌 수 있다.
    // 때문에 √N 이하까지만 검색해서 약수의 유무를 파악해도 똑같은 소수 판별 결과를 낼 수 있다.
    // 하지만 시간 복잡도를 최적화하여 사용했기에 효율적인 검색 방법이다. O(√N)
}
