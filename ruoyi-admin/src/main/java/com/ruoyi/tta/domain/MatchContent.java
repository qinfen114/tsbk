package com.ruoyi.tta.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 对局信息对象 match_content
 * 
 * @author 清
 * @date 2024-04-04
 */
public class MatchContent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** A时代黑卡 */
    @Excel(name = "A时代黑卡")
    private String aEraBlackCards;

    /** A时代卡 */
    @Excel(name = "A时代卡")
    private String aEraCards;

    /** 1时代黑卡 */
    @Excel(name = "1时代黑卡")
    private String oneEraBlackCards;

    /** 1时代卡 */
    @Excel(name = "1时代卡")
    private String oneEraCards;

    /** 2时代黑卡 */
    @Excel(name = "2时代黑卡")
    private String twoEraBlackCards;

    /** 2时代卡 */
    @Excel(name = "2时代卡")
    private String twoEraCards;

    /** 3时代黑卡 */
    @Excel(name = "3时代黑卡")
    private String threeEraBlackCards;

    /** 3时代卡 */
    @Excel(name = "3时代卡")
    private String threeEraCards;

    /** 当前时代 */
    @Excel(name = "当前时代")
    private String nowEra;

    /** 阵型列表 */
    @Excel(name = "阵型列表")
    private String formationList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setaEraBlackCards(String aEraBlackCards) 
    {
        this.aEraBlackCards = aEraBlackCards;
    }

    public String getaEraBlackCards() 
    {
        return aEraBlackCards;
    }
    public void setaEraCards(String aEraCards) 
    {
        this.aEraCards = aEraCards;
    }

    public String getaEraCards() 
    {
        return aEraCards;
    }
    public void setOneEraBlackCards(String oneEraBlackCards) 
    {
        this.oneEraBlackCards = oneEraBlackCards;
    }

    public String getOneEraBlackCards() 
    {
        return oneEraBlackCards;
    }
    public void setOneEraCards(String oneEraCards) 
    {
        this.oneEraCards = oneEraCards;
    }

    public String getOneEraCards() 
    {
        return oneEraCards;
    }
    public void setTwoEraBlackCards(String twoEraBlackCards) 
    {
        this.twoEraBlackCards = twoEraBlackCards;
    }

    public String getTwoEraBlackCards() 
    {
        return twoEraBlackCards;
    }
    public void setTwoEraCards(String twoEraCards) 
    {
        this.twoEraCards = twoEraCards;
    }

    public String getTwoEraCards() 
    {
        return twoEraCards;
    }
    public void setThreeEraBlackCards(String threeEraBlackCards) 
    {
        this.threeEraBlackCards = threeEraBlackCards;
    }

    public String getThreeEraBlackCards() 
    {
        return threeEraBlackCards;
    }
    public void setThreeEraCards(String threeEraCards) 
    {
        this.threeEraCards = threeEraCards;
    }

    public String getThreeEraCards() 
    {
        return threeEraCards;
    }
    public void setNowEra(String nowEra) 
    {
        this.nowEra = nowEra;
    }

    public String getNowEra() 
    {
        return nowEra;
    }
    public void setFormationList(String formationList) 
    {
        this.formationList = formationList;
    }

    public String getFormationList() 
    {
        return formationList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("aEraBlackCards", getaEraBlackCards())
            .append("aEraCards", getaEraCards())
            .append("oneEraBlackCards", getOneEraBlackCards())
            .append("oneEraCards", getOneEraCards())
            .append("twoEraBlackCards", getTwoEraBlackCards())
            .append("twoEraCards", getTwoEraCards())
            .append("threeEraBlackCards", getThreeEraBlackCards())
            .append("threeEraCards", getThreeEraCards())
            .append("nowEra", getNowEra())
            .append("formationList", getFormationList())
            .toString();
    }
}
