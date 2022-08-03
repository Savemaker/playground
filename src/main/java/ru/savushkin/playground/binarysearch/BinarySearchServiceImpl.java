package ru.savushkin.playground.binarysearch;

public class BinarySearchServiceImpl implements BinarySearchService {

    @Override
    public int binarySearch(int[] arr, int number) {
        int end = arr.length - 1;
        int start = 0;

        while (end - start >= 0) {
            int medium = findMedium(start, end);
            if (number == arr[medium]) {
                return medium;
            } else {
                start = number < arr[medium] ? start : medium + 1;
                end = number < arr[medium] ? medium - 1 : end;
            }
        }
        return -1;
    }

    @Override
    public int findMedium(int start, int end) {
        return start + ((end - start) >>> 1);
    }

}
