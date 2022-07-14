import Sorter.Sorter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SorterTest {
    @Test
    public void SortedArray(){
        Sorter.sort(new int[] {});
    }

    @Test
    public void EmptyArray(){
        int[] arr = new int[] {};
        assertArrayEquals(new int[] {}, Sorter.sort(arr));
    }

    @Test
    public void OneElement(){
        int[] arr = new int[] {1};
        assertArrayEquals(new int[] {1}, Sorter.sort(arr));
    }

    @Test
    public void TwoElements(){
        int[] arr = new int[] {1,2};
        assertArrayEquals(new int[] {1,2}, Sorter.sort(arr));
    }

    @Test
    public void TwoElements2(){
        int[] arr = new int[] {2,1};
        assertArrayEquals(new int[] {1,2}, Sorter.sort(arr));
    }

    @Test
    public void TwoElements3(){
        int[] arr = new int[] {2,2};
        assertArrayEquals(new int[] {2,2}, Sorter.sort(arr));
    }

    @Test
    public void ThreeElements(){
        int[] arr = new int[] {1,2,3};
        assertArrayEquals(new int[] {1,2,3}, Sorter.sort(arr));
    }

    @Test
    public void ThreeElements2(){
        int[] arr = new int[] {1,3,2};
        assertArrayEquals(new int[] {1,2,3}, Sorter.sort(arr));
    }

    @Test
    public void ThreeElements3(){
        int[] arr = new int[] {2,3,1};
        assertArrayEquals(new int[] {1,2,3}, Sorter.sort(arr));
    }

    @Test
    public void ThreeElements4(){
        int[] arr = new int[] {2,1,3};
        assertArrayEquals(new int[] {1,2,3}, Sorter.sort(arr));
    }

    @Test
    public void ThreeElements5(){
        int[] arr = new int[] {1,1,1};
        assertArrayEquals(new int[] {1,2,3}, Sorter.sort(arr));
    }

    @Test
    public void FourElements(){
        int[] arr = new int[] {3,2,1,4};
        assertArrayEquals(new int[] {1,2,3,4}, Sorter.sort(arr));
    }

    @Test
    public void TenElements(){
        int[] arr = new int[] {2,1,3,4,7,9,8,5,10,6};
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, Sorter.sort(arr));
    }

}