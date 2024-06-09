package com.ruoyi.tta.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 卡牌列表对象 card_list
 * 
 * @author 清
 * @date 2024-04-04
 */
public class CardList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 卡牌名称 */
    @Excel(name = "卡牌名称")
    private String cardName;

    /** 卡牌描述 */
    @Excel(name = "卡牌描述")
    private String cardContent;

    /** 卡牌类型 */
    @Excel(name = "卡牌类型")
    private String cardType;

    /** 卡牌时代 */
    @Excel(name = "卡牌时代")
    private String cardEra;

    /** 几人开启 */
    @Excel(name = "几人开启")
    private Long number;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCardName(String cardName) 
    {
        this.cardName = cardName;
    }

    public String getCardName() 
    {
        return cardName;
    }
    public void setCardContent(String cardContent) 
    {
        this.cardContent = cardContent;
    }

    public String getCardContent() 
    {
        return cardContent;
    }
    public void setCardType(String cardType) 
    {
        this.cardType = cardType;
    }

    public String getCardType() 
    {
        return cardType;
    }
    public void setCardEra(String cardEra) 
    {
        this.cardEra = cardEra;
    }

    public String getCardEra() 
    {
        return cardEra;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cardName", getCardName())
            .append("cardContent", getCardContent())
            .append("cardType", getCardType())
            .append("cardEra", getCardEra())
            .append("number", getNumber())
            .toString();
    }
}
