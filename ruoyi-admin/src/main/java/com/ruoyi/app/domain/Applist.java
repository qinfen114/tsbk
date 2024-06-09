package com.ruoyi.app.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 软件库对象 applist
 * 
 * @author ruoyi
 * @date 2024-04-05
 */
public class Applist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** app名字 */
    @Excel(name = "app名字")
    private String appName;

    /** app文件地址 */
    @Excel(name = "app文件地址")
    private String appUrl;

    /** app图片地址 */
    @Excel(name = "app图片地址")
    private String imgUrl;

    /** app简介 */
    @Excel(name = "app简介")
    private String appContent;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAppName(String appName) 
    {
        this.appName = appName;
    }

    public String getAppName() 
    {
        return appName;
    }
    public void setAppUrl(String appUrl) 
    {
        this.appUrl = appUrl;
    }

    public String getAppUrl() 
    {
        return appUrl;
    }
    public void setImgUrl(String imgUrl) 
    {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() 
    {
        return imgUrl;
    }
    public void setAppContent(String appContent) 
    {
        this.appContent = appContent;
    }

    public String getAppContent() 
    {
        return appContent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("appName", getAppName())
            .append("appUrl", getAppUrl())
            .append("imgUrl", getImgUrl())
            .append("appContent", getAppContent())
            .toString();
    }
}
