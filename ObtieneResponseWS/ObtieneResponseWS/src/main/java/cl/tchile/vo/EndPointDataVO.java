package cl.tchile.vo;

/**
 *
 */
public class EndPointDataVO {

    /**
     * endPointUrl
     */
    private String endPointUrl;
    /**
     * timeOut
     */
    private String timeOut;
    /**
     * servLocator
     */
    private String servLocator;

    /**
     * @param endPointUrl
     * @param timeOut
     * @param servLocator
     */
    public EndPointDataVO(String endPointUrl, String timeOut, String servLocator) {
        this.endPointUrl = endPointUrl;
        this.timeOut = timeOut;
        this.servLocator = servLocator;
    }

    /**
     * @return
     */
    public String getEndPointUrl() {
        return endPointUrl;
    }

    /**
     * @param endPointUrl
     */
    public void setEndPointUrl(String endPointUrl) {
        this.endPointUrl = endPointUrl;
    }

    /**
     * @return
     */
    public String getTimeOut() {
        return timeOut;
    }

    /**
     * @param timeOut
     */
    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    /**
     * @return
     */
    public String getServLocator() {
        return servLocator;
    }

    /**
     * @param servLocator
     */
    public void setServLocator(String servLocator) {
        this.servLocator = servLocator;
    }

}
