package com.ruoyi.tta.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.tta.mapper.CardListMapper;
import com.ruoyi.tta.domain.CardList;
import com.ruoyi.tta.service.ICardListService;

/**
 * 卡牌列表Service业务层处理
 * 
 * @author 清
 * @date 2024-04-04
 */
@Service
public class CardListServiceImpl implements ICardListService 
{
    @Autowired
    private CardListMapper cardListMapper;

    /**
     * 查询卡牌列表
     * 
     * @param id 卡牌列表主键
     * @return 卡牌列表
     */
    @Override
    public CardList selectCardListById(Long id)
    {
        return cardListMapper.selectCardListById(id);
    }

    /**
     * 查询卡牌列表列表
     * 
     * @param cardList 卡牌列表
     * @return 卡牌列表
     */
    @Override
    public List<CardList> selectCardListList(CardList cardList)
    {
        return cardListMapper.selectCardListList(cardList);
    }

    /**
     * 新增卡牌列表
     * 
     * @param cardList 卡牌列表
     * @return 结果
     */
    @Override
    public int insertCardList(CardList cardList)
    {
        return cardListMapper.insertCardList(cardList);
    }

    /**
     * 修改卡牌列表
     * 
     * @param cardList 卡牌列表
     * @return 结果
     */
    @Override
    public int updateCardList(CardList cardList)
    {
        return cardListMapper.updateCardList(cardList);
    }

    /**
     * 批量删除卡牌列表
     * 
     * @param ids 需要删除的卡牌列表主键
     * @return 结果
     */
    @Override
    public int deleteCardListByIds(Long[] ids)
    {
        return cardListMapper.deleteCardListByIds(ids);
    }

    /**
     * 删除卡牌列表信息
     * 
     * @param id 卡牌列表主键
     * @return 结果
     */
    @Override
    public int deleteCardListById(Long id)
    {
        return cardListMapper.deleteCardListById(id);
    }
}
