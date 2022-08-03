package ru.savushkin.playground.binarysearch;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BinarySearchServiceTest {

    private final BinarySearchService binarySearchService;
    private final int[] arr = {1, 3, 4, 120, 125, 180, 181, 186};

    public BinarySearchServiceTest() {
        this.binarySearchService = new BinarySearchServiceImpl();
    }

    @Test
    void testFindMedium() {
        Assertions.assertThat(binarySearchService.findMedium(0, 4)).isEqualTo(2);
        Assertions.assertThat(binarySearchService.findMedium(1, 4)).isEqualTo(2);
        Assertions.assertThat(binarySearchService.findMedium(5, 7)).isEqualTo(6);
    }

    @Test
    void binarySearch() {
        Assertions.assertThat(binarySearchService.binarySearch(arr, 1)).isEqualTo(0);
        Assertions.assertThat(binarySearchService.binarySearch(arr, 3)).isEqualTo(1);
        Assertions.assertThat(binarySearchService.binarySearch(arr, 4)).isEqualTo(2);
        Assertions.assertThat(binarySearchService.binarySearch(arr, 120)).isEqualTo(3);
        Assertions.assertThat(binarySearchService.binarySearch(arr, 125)).isEqualTo(4);
        Assertions.assertThat(binarySearchService.binarySearch(arr, 180)).isEqualTo(5);
        Assertions.assertThat(binarySearchService.binarySearch(arr, 181)).isEqualTo(6);
        Assertions.assertThat(binarySearchService.binarySearch(arr, 186)).isEqualTo(7);
    }
}