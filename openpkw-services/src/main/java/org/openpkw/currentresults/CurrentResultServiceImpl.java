package org.openpkw.currentresults;

        import org.springframework.scheduling.annotation.EnableScheduling;
        import org.springframework.scheduling.annotation.Scheduled;
        import org.springframework.stereotype.Service;

        import java.util.Date;

/**
 * @author Karol Dzięgiel
 * @version 27 Sep 2015
 */
@EnableScheduling
@Service
public class CurrentResultServiceImpl implements CurrentResultService {

    private Date timestamp;
    //private ResultDTO result
    //results will be calculated each 10 minutes
    //waiting for function that calculates them

    @Scheduled(fixedRate = 10 * 60 * 1000)
    public void setCurrentTimestamp() {
        timestamp = new Date();
    }

    @Override
    public Date getDate() {
        return timestamp;
    }
}