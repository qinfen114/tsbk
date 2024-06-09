package com.ruoyi.tta.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 对局面板对象 match_userinfo
 * 
 * @author 清
 * @date 2024-04-04
 */
public class MatchUserinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 对局id */
    @Excel(name = "对局id")
    private Long matchId;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 粮食 */
    @Excel(name = "粮食")
    private Long food;

    /** 粮食产量 */
    @Excel(name = "粮食产量")
    private Long foodAdd;

    /** 矿 */
    @Excel(name = "矿")
    private Long mine;

    /** 矿产量 */
    @Excel(name = "矿产量")
    private Long mineAdd;

    /** 科技 */
    @Excel(name = "科技")
    private Long science;

    /** 科学增速 */
    @Excel(name = "科学增速")
    private Long scienceAdd;

    /** 文化 */
    @Excel(name = "文化")
    private Long culture;

    /** 文化增速 */
    @Excel(name = "文化增速")
    private Long cultureAdd;

    /** 农场 */
    @Excel(name = "农场")
    private String agriculture;

    /** 矿山 */
    @Excel(name = "矿山")
    private String minerals;

    /** 实验室 */
    @Excel(name = "实验室")
    private String lab;

    /** 宗教 */
    @Excel(name = "宗教")
    private String religion;

    /** 印刷 */
    @Excel(name = "印刷")
    private String print;

    /** 角斗场 */
    @Excel(name = "角斗场")
    private String abattoir;

    /** 戏剧 */
    @Excel(name = "戏剧")
    private String drama;

    /** 蓝卡 */
    @Excel(name = "蓝卡")
    private String blueCard;

    /** 步兵 */
    @Excel(name = "步兵")
    private String swordman;

    /** 骑兵 */
    @Excel(name = "骑兵")
    private String knight;

    /** 炮兵 */
    @Excel(name = "炮兵")
    private String artillerist;

    /** 飞机 */
    @Excel(name = "飞机")
    private String plane;

    /** 手卡 */
    @Excel(name = "手卡")
    private String hardCard;

    /** 白点 */
    @Excel(name = "白点")
    private Long wirtePoint;

    /** 红点 */
    @Excel(name = "红点")
    private Long redPoint;

    /** 奇迹 */
    @Excel(name = "奇迹")
    private String miracleList;

    /** 领袖 */
    @Excel(name = "领袖")
    private String leader;

    /** 军阵 */
    @Excel(name = "军阵")
    private Integer formationId;

    /** 政体 */
    @Excel(name = "政体")
    private String polity;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMatchId(Long matchId) 
    {
        this.matchId = matchId;
    }

    public Long getMatchId() 
    {
        return matchId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setFood(Long food) 
    {
        this.food = food;
    }

    public Long getFood() 
    {
        return food;
    }
    public void setFoodAdd(Long foodAdd) 
    {
        this.foodAdd = foodAdd;
    }

    public Long getFoodAdd() 
    {
        return foodAdd;
    }
    public void setMine(Long mine) 
    {
        this.mine = mine;
    }

    public Long getMine() 
    {
        return mine;
    }
    public void setMineAdd(Long mineAdd) 
    {
        this.mineAdd = mineAdd;
    }

    public Long getMineAdd() 
    {
        return mineAdd;
    }
    public void setScience(Long science) 
    {
        this.science = science;
    }

    public Long getScience() 
    {
        return science;
    }
    public void setScienceAdd(Long scienceAdd) 
    {
        this.scienceAdd = scienceAdd;
    }

    public Long getScienceAdd() 
    {
        return scienceAdd;
    }
    public void setCulture(Long culture) 
    {
        this.culture = culture;
    }

    public Long getCulture() 
    {
        return culture;
    }
    public void setCultureAdd(Long cultureAdd) 
    {
        this.cultureAdd = cultureAdd;
    }

    public Long getCultureAdd() 
    {
        return cultureAdd;
    }
    public void setAgriculture(String agriculture) 
    {
        this.agriculture = agriculture;
    }

    public String getAgriculture() 
    {
        return agriculture;
    }
    public void setMinerals(String minerals) 
    {
        this.minerals = minerals;
    }

    public String getMinerals() 
    {
        return minerals;
    }
    public void setLab(String lab) 
    {
        this.lab = lab;
    }

    public String getLab() 
    {
        return lab;
    }
    public void setReligion(String religion) 
    {
        this.religion = religion;
    }

    public String getReligion() 
    {
        return religion;
    }
    public void setPrint(String print) 
    {
        this.print = print;
    }

    public String getPrint() 
    {
        return print;
    }
    public void setAbattoir(String abattoir) 
    {
        this.abattoir = abattoir;
    }

    public String getAbattoir() 
    {
        return abattoir;
    }
    public void setDrama(String drama) 
    {
        this.drama = drama;
    }

    public String getDrama() 
    {
        return drama;
    }
    public void setBlueCard(String blueCard) 
    {
        this.blueCard = blueCard;
    }

    public String getBlueCard() 
    {
        return blueCard;
    }
    public void setSwordman(String swordman) 
    {
        this.swordman = swordman;
    }

    public String getSwordman() 
    {
        return swordman;
    }
    public void setKnight(String knight) 
    {
        this.knight = knight;
    }

    public String getKnight() 
    {
        return knight;
    }
    public void setArtillerist(String artillerist) 
    {
        this.artillerist = artillerist;
    }

    public String getArtillerist() 
    {
        return artillerist;
    }
    public void setPlane(String plane) 
    {
        this.plane = plane;
    }

    public String getPlane() 
    {
        return plane;
    }
    public void setHardCard(String hardCard) 
    {
        this.hardCard = hardCard;
    }

    public String getHardCard() 
    {
        return hardCard;
    }
    public void setWirtePoint(Long wirtePoint) 
    {
        this.wirtePoint = wirtePoint;
    }

    public Long getWirtePoint() 
    {
        return wirtePoint;
    }
    public void setRedPoint(Long redPoint) 
    {
        this.redPoint = redPoint;
    }

    public Long getRedPoint() 
    {
        return redPoint;
    }
    public void setMiracleList(String miracleList) 
    {
        this.miracleList = miracleList;
    }

    public String getMiracleList() 
    {
        return miracleList;
    }
    public void setLeader(String leader) 
    {
        this.leader = leader;
    }

    public String getLeader() 
    {
        return leader;
    }
    public void setFormationId(Integer formationId) 
    {
        this.formationId = formationId;
    }

    public Integer getFormationId() 
    {
        return formationId;
    }
    public void setPolity(String polity) 
    {
        this.polity = polity;
    }

    public String getPolity() 
    {
        return polity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("matchId", getMatchId())
            .append("userId", getUserId())
            .append("food", getFood())
            .append("foodAdd", getFoodAdd())
            .append("mine", getMine())
            .append("mineAdd", getMineAdd())
            .append("science", getScience())
            .append("scienceAdd", getScienceAdd())
            .append("culture", getCulture())
            .append("cultureAdd", getCultureAdd())
            .append("agriculture", getAgriculture())
            .append("minerals", getMinerals())
            .append("lab", getLab())
            .append("religion", getReligion())
            .append("print", getPrint())
            .append("abattoir", getAbattoir())
            .append("drama", getDrama())
            .append("blueCard", getBlueCard())
            .append("swordman", getSwordman())
            .append("knight", getKnight())
            .append("artillerist", getArtillerist())
            .append("plane", getPlane())
            .append("hardCard", getHardCard())
            .append("wirtePoint", getWirtePoint())
            .append("redPoint", getRedPoint())
            .append("miracleList", getMiracleList())
            .append("leader", getLeader())
            .append("formationId", getFormationId())
            .append("polity", getPolity())
            .toString();
    }
}
