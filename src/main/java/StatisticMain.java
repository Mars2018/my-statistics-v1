import com.mars.statisticalutil.controller.StatisticController;
import com.mars.statisticalutil.model.StatisticBean;
import com.mars.statisticalutil.view.MyFrame;
import com.mars.statisticalutil.view.actionlisteners.AddElementActionListener;
import com.mars.statisticalutil.view.actionlisteners.FileLoaderActionListener;
import com.mars.statisticalutil.view.actionlisteners.ResetActionListener;

/**
 * Main class to start the system
 * Created by RCao on 2016/10/4.
 */
public class StatisticMain {

    public static void main(String[] args){
        //create main frame
        MyFrame mainFrame = new MyFrame("Simple stats");
        StatisticBean statisticBean = new StatisticBean();
        StatisticController controller = new StatisticController(statisticBean);
        mainFrame.setStatisticBean(statisticBean);
        FileLoaderActionListener fileLoader = new FileLoaderActionListener(statisticBean, mainFrame, controller);
        mainFrame.getJbFile().addActionListener(fileLoader);
        mainFrame.getJbAdd().addActionListener(new AddElementActionListener(controller, mainFrame));
        mainFrame.getJbReset().addActionListener(new ResetActionListener(controller, mainFrame));
        mainFrame.setVisible(true);
    }
}
