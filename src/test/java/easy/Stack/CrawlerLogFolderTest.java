package easy.Stack;

import org.junit.Test;

public class CrawlerLogFolderTest {
    CrawlerLogFolder crawlerLogFolder = new CrawlerLogFolder();

    @Test
    public void testCrawlerLogFolder(){
        assert crawlerLogFolder.minOperations(new String[]{"d1/","d2/","../","d21/","./"}) == 2;
        assert crawlerLogFolder.minOperations(new String[]{"d1/","d2/","./","d3/","../","d31/"}) == 3;
    }
}
