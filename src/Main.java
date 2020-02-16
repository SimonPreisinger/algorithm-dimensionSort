public class Main {

  public static void main(String[] args) {
    SimpleDimensionSort dimensionSort = new SimpleDimensionSort();
    int[] toSortArray = {3, 2, 5, 7};
    dimensionSort.sort(toSortArray);
    int[] toSortArray2 = {9, 2, 5, 7, 3, 5, 8, 4};
    dimensionSort.sort(toSortArray2);
    int[] toSortArray3 = {999, 2, 57, 7, 33, 57, 85, 48};
    dimensionSort.sort(toSortArray3);
    int[] toSortArray4 = {3, 2, 5, 7, 23, 4, 6767, 3, 123, 412};
    dimensionSort.sort(toSortArray4);
  }
}
