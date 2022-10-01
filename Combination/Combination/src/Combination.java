import java.util.ArrayList;

public class Combination {
    public static void main(String[] args) {

        String[] lookup = new String[]{"A", "B", "C", "D", "E"};
        ArrayList<String[]> lookupFor = combination(lookup);
    }

    public static ArrayList<String[]> combination(String[] str) {
        ArrayList<String[]> result = new ArrayList<>();
        //조합 특징1: 반복문의 시작이 이전 반복문 시작+1 이다.
        //이전 요소가 다시 뽑힐 필요가 없기 때문(순서가 필요없다는 뜻)
        //조합 특징2: 뽑고 싶은 만큼 반복문을 사용하면 된다.
        //현재 예시) 5C3; str 의 5개 요소에서 3개를 뽑는다.
        for(int i = 0; i < str.length; i++) {
            for(int j = i + 1; j < str.length; j++) {
                for(int k = j + 1; k < str.length; k++) {
                    String[] input = new String[]{str[i], str[j], str[k]};
                    result.add(input);
                }
            }
        }
        return result;
    }
}
