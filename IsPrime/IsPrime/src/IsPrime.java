public class IsPrime {
    public static void main(String[] args) {

    }

    public static boolean isPrime(int num) {
        // 0 과 1 은 소수가 아니다
        if(num < 2) {
            return false;
        }
        // 2 는 소수다
        if(num == 2) {
            return true;
        }

        for(int i = 2; i < num; i++) {
            // 소수가 아닐경우, num(본인) 제외 약수가 존재
            if(num % i == 0) {
                return false;
            }
        }
        // 위 반복문에서 약수를 갖고 있지 않는경우 소수다.
        return true;
    }
}