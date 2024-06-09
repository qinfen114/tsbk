package com.ruoyi.tta.mapper;

import java.util.List;
import com.ruoyi.tta.domain.CardList;

/**
 * 卡牌列表Mapper接口
 * 
 * @author 清
 * @date 2024-04-04
 */
public interface CardListMapper 
{
    /**
     * 查询卡牌列表
     * 
     * @param id 卡牌列表主键
     * @return 卡牌列表
     */
    public CardList selectCardListById(Long id);

    /**
     * 查询卡牌列表列表
     * 
     * @param cardList 卡牌列表
     * @return 卡牌列表集合
     */
    public List<CardList> selectCardListList(CardList cardList);

    /**
     * 新增卡牌列表
     * 
     * @param cardList 卡牌列表
     * @return 结果
     */
    public int insertCardList(CardList cardList);

    /**
     * 修改卡牌列表
     * 
     * @param cardList 卡牌列表
     * @return 结果
     */
    public int updateCardList(CardList cardList);

    /**
     * 删除卡牌列表
     * 
     * @param id 卡牌列表主键
     * @return 结果
     */
    public int deleteCardListById(Long id);

    /**
     * 批量删除卡牌列表
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCardListByIds(Long[] ids);
}
