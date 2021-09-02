package onem.mfs.springdemo.annotationconfigapplicationcontextdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author:MuFanSen
 * @date: 11:20 2021/6/2
 */
@Component
public class TulingDao2 {

    @Autowired
    private TulingDao tulingDao;
}
