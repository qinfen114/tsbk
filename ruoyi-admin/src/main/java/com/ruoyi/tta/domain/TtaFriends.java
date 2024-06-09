package com.ruoyi.tta.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 好友列表对象 tta_friends
 * 
 * @author 清
 * @date 2024-04-04
 */
public class TtaFriends extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 聊天id */
    private Long chatId;

    /** 用户id1 */
    @Excel(name = "用户id1")
    private Long userId;

    /** 用户名1 */
    @Excel(name = "用户名1")
    private String userName;

    /** 用户id2 */
    @Excel(name = "用户id2")
    private Long userId2;

    /** 用户名2 */
    @Excel(name = "用户名2")
    private String userName2;

    /** 用户id3 */
    @Excel(name = "用户id3")
    private Long userId3;

    /** 用户名3 */
    @Excel(name = "用户名3")
    private String userName3;

    /** 用户id4 */
    @Excel(name = "用户id4")
    private Long userId4;

    /** 用户名4 */
    @Excel(name = "用户名4")
    private String userName4;

    public void setChatId(Long chatId) 
    {
        this.chatId = chatId;
    }

    public Long getChatId() 
    {
        return chatId;
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
    public void setUserId2(Long userId2) 
    {
        this.userId2 = userId2;
    }

    public Long getUserId2() 
    {
        return userId2;
    }
    public void setUserName2(String userName2) 
    {
        this.userName2 = userName2;
    }

    public String getUserName2() 
    {
        return userName2;
    }
    public void setUserId3(Long userId3) 
    {
        this.userId3 = userId3;
    }

    public Long getUserId3() 
    {
        return userId3;
    }
    public void setUserName3(String userName3) 
    {
        this.userName3 = userName3;
    }

    public String getUserName3() 
    {
        return userName3;
    }
    public void setUserId4(Long userId4) 
    {
        this.userId4 = userId4;
    }

    public Long getUserId4() 
    {
        return userId4;
    }
    public void setUserName4(String userName4) 
    {
        this.userName4 = userName4;
    }

    public String getUserName4() 
    {
        return userName4;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("chatId", getChatId())
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("userId2", getUserId2())
            .append("userName2", getUserName2())
            .append("userId3", getUserId3())
            .append("userName3", getUserName3())
            .append("userId4", getUserId4())
            .append("userName4", getUserName4())
            .toString();
    }
}
