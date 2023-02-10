import java.util.List;
import java.util.ArrayList;

public class MergeSort {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(38);
    list.add(27);
    list.add(43);
    list.add(3);
    list.add(9);
    list.add(82);
    list.add(10);
    System.out.println("Before sorting: " + list);
    list = mergeSort(list);
    System.out.println("After sorting: " + list);
  }

  public static List<Integer> mergeSort(List<Integer> list) {
    if (list.size() <= 1) {
      return list;
    }

    int mid = list.size() / 2;
    List<Integer> left = new ArrayList<>(list.subList(0, mid));
    List<Integer> right = new ArrayList<>(list.subList(mid, list.size()));

    left = mergeSort(left);
    right = mergeSort(right);

    return merge(left, right);
  }

  public static List<Integer> merge(List<Integer> left, List<Integer> right) {
    List<Integer> result = new ArrayList<>();
    int i = 0, j = 0;
    while (i < left.size() && j < right.size()) {
      if (left.get(i) <= right.get(j)) {
        result.add(left.get(i));
        i++;
      } else {
        result.add(right.get(j));
        j++;
      }
    }
    while (i < left.size()) {
      result.add(left.get(i));
      i++;
    }
    while (j < right.size()) {
      result.add(right.get(j));
      j++;
    }
    return result;
  }
}
