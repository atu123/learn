package cc.atu123.learn;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Arrays;

/**
 * @author: lichongwang  Date: 2018/1/10 Time: 16:33
 */
public class AppLog {
    private String act;
    @JSONField(name = "news_ids")
    private String[] newsIds;
    @JSONField(name = "news_id")
    private String newsId;
    @JSONField(name = "client_id")
    private String clientId;
    @JSONField(name = "req_time")
    private String reqTime;

    public String getAct() {
        return act;
    }

    public void setAct(String act) {
        this.act = act;
    }

    public String[] getNewsIds() {
        return newsIds;
    }

    public void setNewsIds(String newsIdsStr) {
        this.newsIds = newsIdsStr.split(",");
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getReqTime() {
        return reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AppLog{");
        sb.append("act='").append(act).append('\'');
        sb.append(", newsIds=").append(Arrays.toString(newsIds));
        sb.append(", newsId=").append(newsId);
        sb.append(", clientId='").append(clientId).append('\'');
        sb.append(", reqTime=").append(reqTime);
        sb.append('}');
        return sb.toString();
    }
}
