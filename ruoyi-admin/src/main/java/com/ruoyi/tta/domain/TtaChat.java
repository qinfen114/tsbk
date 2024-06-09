package com.ruoyi.tta.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 消息列表对象 tta_chat
 * 
 * @author 清
 * @date 2024-04-04
 */
public class TtaChat extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 聊天id */
    @Excel(name = "聊天id")
    private Long charId;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 用户名 */
    @Excel(name = "用户名")
    private String userName;

    /** 聊天内容 */
    @Excel(name = "聊天内容")
    private String content;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCharId(Long charId) 
    {
        this.charId = charId;
    }

    public Long getCharId() 
    {
        return charId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("charId", getCharId())
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("content", getContent())
            .toString();
    }
}
