import java.util.Comparator;

/**
 *  병합정렬
 *   - 배열을 절반씩 나누어 각각 정렬한 다음 이 둘을 합하여 다시 정렬하는 방법
 *   - 나눠진 배열의 첫 원소끼리 비교하여
 *
 *  장점
 *   -
 *
 *  단점
 *   -
 */

public class MergeSort {

    public static void sort(Player[] players, Comparator<Player> c) {

        Player[] helper = new Player[players.length];

        mergeSort(players, helper, 0, players.length-1, c);

    }

    private static void mergeSort(Player[] players, Player[] helper, int low, int high, Comparator<Player> c) {
        if (low < high) {
            int middle = (low+high)/2;
            mergeSort(players, helper, low, middle, c);            // 왼쪽 분할
            mergeSort(players, helper, middle+1, high, c);     // 오른쪽 분할
            merge(players, helper, low, middle, high, c);          // 병합
        }
    }

    private static void merge(Player[] players, Player[] helper, int low, int middle, int high, Comparator<Player> c) {
        for (int i=low; i<=high; i++) {
            helper[i] = players[i];
        }

        int left = low;
        int right = middle + 1;
        int current = low;

        while(left <= middle && right <= high) {
            if (c.compare(helper[left], helper[right]) == -1) {
                players[current] = helper[left];
                left++;
            } else {
                players[current] = helper[right];
                right++;
            }
            current++;
        }

        int remain = middle - left;
        for (int i=0; i<=remain; i++)
            players[current+i] = helper[left+i];

    }


    private static void swap(Player[] players, int i, int j) {
        Player temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    }

}
