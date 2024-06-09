package com.ruoyi.tta.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.tta.domain.CardList;
import com.ruoyi.tta.service.ICardListService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 卡牌列表Controller
 * 
 * @author 清
 * @date 2024-04-04
 */
@RestController
@RequestMapping("/tta/cards")
public class CardListController extends BaseController
{
    @Autowired
    private ICardListService cardListService;

    /**
     * 查询卡牌列表列表
     */
    @PreAuthorize("@ss.hasPermi('tta:cards:list')")
    @GetMapping("/list")
    public TableDataInfo list(CardList cardList)
    {
        startPage();
        List<CardList> list = cardListService.selectCardListList(cardList);
        return getDataTable(list);
    }

    /**
     * 导出卡牌列表列表
     */
    @PreAuthorize("@ss.hasPermi('tta:cards:export')")
    @Log(title = "卡牌列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CardList cardList)
    {
        List<CardList> list = cardListService.selectCardListList(cardList);
        ExcelUtil<CardList> util = new ExcelUtil<CardList>(CardList.class);
        util.exportExcel(response, list, "卡牌列表数据");
    }

    /**
     * 获取卡牌列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('tta:cards:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(cardListService.selectCardListById(id));
    }

    /**
     * 新增卡牌列表
     */
    @PreAuthorize("@ss.hasPermi('tta:cards:add')")
    @Log(title = "卡牌列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CardList cardList)
    {
        return toAjax(cardListService.insertCardList(cardList));
    }

    /**
     * 修改卡牌列表
     */
    @PreAuthorize("@ss.hasPermi('tta:cards:edit')")
    @Log(title = "卡牌列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CardList cardList)
    {
        return toAjax(cardListService.updateCardList(cardList));
    }

    /**
     * 删除卡牌列表
     */
    @PreAuthorize("@ss.hasPermi('tta:cards:remove')")
    @Log(title = "卡牌列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(cardListService.deleteCardListByIds(ids));
    }
}
