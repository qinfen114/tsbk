package com.ruoyi.Stick.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 评论列表对象 chatlist
 * 
 * @author 清
 * @date 2024-05-15
 */
public class Chatlist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 评论id */
    private Long cid;

    /** 帖子id */
    @Excel(name = "帖子id")
    private Long pid;

    /** 用户id */
    @Excel(name = "用户id")
    private Long uid;

    /** 内容 */
    @Excel(name = "内容")
    private String content;

    /** 文件路径 */
    @Excel(name = "文件路径")
    private String files;

    /** 图片路径 */
    @Excel(name = "图片路径")
    private String imgurls;

    /** 用户名 */
    @Excel(name = "用户名")
    private String uname;

    /** 用户头像 */
    @Excel(name = "用户头像")
    private String avatar;

    public void setCid(Long cid) 
    {
        this.cid = cid;
    }

    public Long getCid() 
    {
        return cid;
    }
    public void setPid(Long pid) 
    {
        this.pid = pid;
    }

    public Long getPid() 
    {
        return pid;
    }
    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
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
    public void setImgurls(String imgurls) 
    {
        this.imgurls = imgurls;
    }

    public String getImgurls() 
    {
        return imgurls;
    }
    public void setUname(String uname) 
    {
        this.uname = uname;
    }

    public String getUname() 
    {
        return uname;
    }
    public void setAvatar(String avatar) 
    {
        this.avatar = avatar;
    }

    public String getAvatar() 
    {
        return avatar;
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
            .append("cid", getCid())
            .append("pid", getPid())
            .append("uid", getUid())
            .append("content", getContent())
            .append("createtime", getCreatetime())
            .append("files", getFiles())
            .append("imgurls", getImgurls())
            .append("uname", getUname())
            .append("avatar", getAvatar())
            .toString();
    }
}
