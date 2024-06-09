package com.ruoyi.Stick.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 帖子详情对象 postcontent
 * 
 * @author 清
 * @date 2024-05-08
 */
public class Postcontent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 帖子id */
    private Long pid;

    /** 图片库 */
    @Excel(name = "图片库")
    private String imgurls;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 文件 */
    @Excel(name = "文件")
    private String files;

    /** 时间 */
    @Excel(name = "时间")
    private String ctime;

    /** 白名单 */
    @Excel(name = "白名单")
    private String whitelist;

    /** 黑名单 */
    @Excel(name = "黑名单")
    private String blacklist;

    /** 作者id */
    @Excel(name = "作者id")
    private Long authorId;

    /** 作者昵称 */
    @Excel(name = "作者昵称")
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
    public void setImgurls(String imgurls) 
    {
        this.imgurls = imgurls;
    }

    public String getImgurls() 
    {
        return imgurls;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setFiles(String files) 
    {
        this.files = files;
    }

    public String getFiles() 
    {
        return files;
    }
    public void setCtime(String ctime) 
    {
        this.ctime = ctime;
    }

    public String getCtime() 
    {
        return ctime;
    }
    public void setWhitelist(String whitelist) 
    {
        this.whitelist = whitelist;
    }

    public String getWhitelist() 
    {
        return whitelist;
    }
    public void setBlacklist(String blacklist) 
    {
        this.blacklist = blacklist;
    }

    public String getBlacklist() 
    {
        return blacklist;
    }
    public void setAuthorId(Long authorId) 
    {
        this.authorId = authorId;
    }

    public Long getAuthorId() 
    {
        return authorId;
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
            .append("imgurls", getImgurls())
            .append("title", getTitle())
            .append("content", getContent())
            .append("files", getFiles())
            .append("ctime", getCtime())
            .append("whitelist", getWhitelist())
            .append("blacklist", getBlacklist())
            .append("authorId", getAuthorId())
            .append("authorName", getAuthorName())
            .append("type", getType())
            .append("createtime", getCreatetime())
            .toString();
    }
}
