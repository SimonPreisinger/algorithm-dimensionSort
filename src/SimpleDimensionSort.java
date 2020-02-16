class SimpleDimensionSort {
  void sort(int[] toSortArray) {
    // show toSortArray
    System.out.println("original");
    for (int i : toSortArray) {
      System.out.println(i);
    }

    // get maxValue of Array
    int maxValue = 0;
    for (int a : toSortArray) {
      if (maxValue < a) {
        maxValue = a;
      }
    }
    System.out.println("maxValue " + maxValue);

    System.out.println("write in Array with additional Dimension");
    // create Array with one more dimension
    int[][] newDimensionArray = new int[toSortArray.length][maxValue];
    for (int i = 0; i < toSortArray.length; i++) {
      for (int j = 0; j < maxValue; j++) {
        if (toSortArray[i] == j + 1) {
          newDimensionArray[i][j] = toSortArray[i];
        }
      }
    }

    System.out.println("new Dimension Array");
    for (int m = 0; m < toSortArray.length; m++) {
      for (int n = 0; n < maxValue; n++) {
        System.out.println(m + " " + n + " value " + newDimensionArray[m][n]);
      }
    }

    System.out.println("sort (read with other way");
    int index = 0;
    for (int o = 0; o < maxValue; o++) {
      for (int p = 0; p < toSortArray.length; p++) {
        if (newDimensionArray[p][o] != 0) {
          toSortArray[index] = newDimensionArray[p][o];
          index++;
        }
      }
    }

    System.out.println("sorted Array");
    for (int i : toSortArray) {
      System.out.println(i);
    }
  }
}
