import java.util.Comparator;

/**
 *  버블정렬
 *   - 인접해 있는 두개의 원소를 비교하여 순서가 바뀌어 있으면 서로 위치를 맞 바꾼다.
 *
 *  장점
 *   - 특정 패스에서 교환이 한 번도 일어나지 않으면 더 이상 패스를 진행하지 않아도 된다. (정렬이 어느정도 되어 있으면 선택 정렬보다 빠른 성능)
 *   - 추가 공간을 필요로 하지 않는다.
 */

public class BubbleSort {

    public static void sort(Player[] players, Comparator<Player> c) {

        int last, latest, i;
        latest = players.length - 1;

        do {
            last = latest;
            for (i=1; i<=last; i++) {
                if (c.compare(players[i], players[i-1]) == -1) {
                    latest = i-1;
                    swap(players, i-1, i);
                }
            }

        } while (latest != last && latest != 0);
    }

    private static void swap(Player[] players, int i, int j) {
        Player temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    }


}
