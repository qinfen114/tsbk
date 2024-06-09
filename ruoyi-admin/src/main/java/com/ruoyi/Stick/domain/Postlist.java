package com.ruoyi.Stick.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 帖子列表对象 postlist
 * 
 * @author 清
 * @date 2024-04-25
 */
public class Postlist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 帖子id */
    @Excel(name = "帖子id")
    private Long pid;

    /** 封面图片 */
    @Excel(name = "封面图片")
    private String Imgurl;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 作者 */
    @Excel(name = "作者")
    private String authorName;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    public void setPid(Long pid) 
    {
        this.pid = pid;
    }

    public Long getPid() 
    {
        return pid;
    }
    public void setImgurl(String Imgurl) 
    {
        this.Imgurl = Imgurl;
    }

    public String getImgurl() 
    {
        return Imgurl;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setAuthorName(String authorName) 
    {
        this.authorName = authorName;
    }

    public String getAuthorName() 
    {
        return authorName;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    /** 创建时间 */
    @Excel(name = "创建时间")
    private String createtime;

    public void setCreatetime(String avatar)
    {
        this.createtime = createtime;
    }

    public String getCreatetime()
    {
        return createtime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("pid", getPid())
            .append("Imgurl", getImgurl())
            .append("title", getTitle())
            .append("createtime", getCreatetime())
            .append("authorName", getAuthorName())
            .append("type", getType())
            .toString();
    }
}
