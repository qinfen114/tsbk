package com.ruoyi.Stick.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 成员列表对象 members
 * 
 * @author 清
 * @date 2024-04-25
 */
public class Members extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long uid;

    /** 昵称 */
    @Excel(name = "昵称")
    private String nickname;

    /** 性别 */
    @Excel(name = "性别")
    private String sex;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long age;

    /** 头像 */
    @Excel(name = "头像")
    private String avatar;

    public void setUid(Long uid) 
    {
        this.uid = uid;
    }

    public Long getUid() 
    {
        return uid;
    }
    public void setNickname(String nickname) 
    {
        this.nickname = nickname;
    }

    public String getNickname() 
    {
        return nickname;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setAge(Long age) 
    {
        this.age = age;
    }

    public Long getAge() 
    {
        return age;
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
            .append("uid", getUid())
            .append("nickname", getNickname())
            .append("sex", getSex())
            .append("age", getAge())
            .append("createtime", getCreatetime())
            .append("avatar", getAvatar())
            .toString();
    }
}
