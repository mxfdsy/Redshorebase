package cww.world.pojo.dto.config;

import com.alibaba.fastjson.JSON;

/**
 * @Descriptions:
 * @Author: daijl
 * @Date : 2018-07-20 10:33
 */
public class DataMaintainPageDTO {

    private String baseUrl;

    private String pageTitle;

    public DataMaintainPageDTO() {
    }

    public DataMaintainPageDTO(String baseUrl, String pageTitle) {
        this.baseUrl = baseUrl;
        this.pageTitle = pageTitle;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
