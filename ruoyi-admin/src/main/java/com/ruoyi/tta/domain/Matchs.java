package com.ruoyi.tta.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 对局列表对象 matchs
 * 
 * @author 清
 * @date 2024-04-04
 */
public class Matchs extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 用户1id */
    @Excel(name = "用户1id")
    private Long userId1;

    /** 用户名1 */
    @Excel(name = "用户名1")
    private String userName1;

    /** 用户2id */
    @Excel(name = "用户2id")
    private Long userId2;

    /** 用户名2 */
    @Excel(name = "用户名2")
    private String userName2;

    /** 用户3id */
    @Excel(name = "用户3id")
    private Long userId3;

    /** 用户名3 */
    @Excel(name = "用户名3")
    private String userName3;

    /** 用户4id */
    @Excel(name = "用户4id")
    private Long userId4;

    /** 用户名4 */
    @Excel(name = "用户名4")
    private String userName4;

    /** 对局状态 */
    @Excel(name = "对局状态")
    private String matchType;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId1(Long userId1) 
    {
        this.userId1 = userId1;
    }

    public Long getUserId1() 
    {
        return userId1;
    }
    public void setUserName1(String userName1) 
    {
        this.userName1 = userName1;
    }

    public String getUserName1() 
    {
        return userName1;
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
    public void setMatchType(String matchType) 
    {
        this.matchType = matchType;
    }

    public String getMatchType() 
    {
        return matchType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId1", getUserId1())
            .append("userName1", getUserName1())
            .append("userId2", getUserId2())
            .append("userName2", getUserName2())
            .append("userId3", getUserId3())
            .append("userName3", getUserName3())
            .append("userId4", getUserId4())
            .append("userName4", getUserName4())
            .append("createTime", getCreateTime())
            .append("matchType", getMatchType())
            .toString();
    }
}
