package org.openpkw.currentresults;

import java.util.Date;

/**
 * @author Karol Dzięgiel
 * @version 27 Sep 2015
 */
public interface CurrentResultService {
    void setCurrentTimestamp();
    Date getDate();
}
