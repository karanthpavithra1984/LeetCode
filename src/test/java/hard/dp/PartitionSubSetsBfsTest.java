package hard.dp;

import medium.dp.PartitionSubSetsBfsOptimal;
import org.junit.Test;

public class PartitionSubSetsBfsTest {
    PartitionSubSetsBfsOptimal partitionSubSetsBfs = new PartitionSubSetsBfsOptimal();

    @Test
    public void test(){
        partitionSubSetsBfs.canPartition(new int[]{1,5,5,11});
    }
}
