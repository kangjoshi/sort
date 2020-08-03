import java.util.Comparator;

/**
 *  선택정렬
 *   - 배열의 앞에서부터 그 위치에 들어가야할 원소를 배열에서 찾아 넣는 방식
 *
 *  장점
 *   - 구현이 매우 간단하다.
 *   - 추가 공간을 필요로 하지 않는다.
 *
 *  단점
 *   - 데이터가 이미 부분적으로 정렬된 경우에도 불필요한 비교 작업을 해야한다.
 *   - 모두 정렬이 되어 있어도 n-1번의 패스를 모두 수행
 */

public class SelectionSort {

    public static void sort(Player[] players, Comparator<Player> c) {
        int min = 0;
        for (int i=0; i<players.length-1; i++) {
            min = i;
            for (int j=i+1; j<players.length; j++) {
                if (c.compare(players[j], players[min]) == -1) {
                    min = j;
                }
            }
            swap(players, i, min);
        }
    }

    private static void swap(Player[] players, int i, int j) {
        Player temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    }


}
