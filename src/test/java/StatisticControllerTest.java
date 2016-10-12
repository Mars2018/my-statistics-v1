import com.mars.statisticalutil.controller.StatisticController;
import com.mars.statisticalutil.model.StatisticBean;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * test the controller
 * Created by RCao on 2016/10/4.
 */
public class StatisticControllerTest {

    private static double EPS = 1e-9;
    private StatisticBean statisticBean = new StatisticBean();
    private StatisticController controller = null;
    private ArrayList<Integer> data = new ArrayList<>();
    {
        data.add(2);
        data.add(4);
        data.add(100);
        data.add(8);
        statisticBean.setData(data);
    }

    @Test
    public void addElement() throws Exception {
        controller = new StatisticController(statisticBean);
        controller.addElement(30);
        double expectMedian = 8;
        double actualMedian = statisticBean.getMedian();
        assertEquals(expectMedian, actualMedian, EPS);

        double expectMean = 28.8;
        double actualMean = statisticBean.getMean();
        assertEquals(expectMean, actualMean, EPS);

        int expectMax = 100;
        int actualMax = statisticBean.getMaxVal();
        assertEquals(expectMax, actualMax);

        int expectMin = 2;
        int actualMin = statisticBean.getMinVal();
        assertEquals(expectMin, actualMin);


    }

    @Test
    public void reset() throws Exception {
        statisticBean.reset();
        assertEquals(0, statisticBean.getData().size());
        assertEquals(0, statisticBean.getSortedData().size());
        assertEquals(0, statisticBean.getNum().intValue());
        assertNull(statisticBean.getMedian());
        assertNull(statisticBean.getMean());
        assertNull(statisticBean.getMaxVal());
        assertNull(statisticBean.getMinVal());



    }

    @Test
    public void refresh() throws Exception {

    }

}