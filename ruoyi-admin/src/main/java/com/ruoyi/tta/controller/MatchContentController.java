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
import com.ruoyi.tta.domain.MatchContent;
import com.ruoyi.tta.service.IMatchContentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 对局信息Controller
 * 
 * @author 清
 * @date 2024-04-04
 */
@RestController
@RequestMapping("/tta/content")
public class MatchContentController extends BaseController
{
    @Autowired
    private IMatchContentService matchContentService;

    /**
     * 查询对局信息列表
     */
    @PreAuthorize("@ss.hasPermi('tta:content:list')")
    @GetMapping("/list")
    public TableDataInfo list(MatchContent matchContent)
    {
        startPage();
        List<MatchContent> list = matchContentService.selectMatchContentList(matchContent);
        return getDataTable(list);
    }

    /**
     * 导出对局信息列表
     */
    @PreAuthorize("@ss.hasPermi('tta:content:export')")
    @Log(title = "对局信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MatchContent matchContent)
    {
        List<MatchContent> list = matchContentService.selectMatchContentList(matchContent);
        ExcelUtil<MatchContent> util = new ExcelUtil<MatchContent>(MatchContent.class);
        util.exportExcel(response, list, "对局信息数据");
    }

    /**
     * 获取对局信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('tta:content:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(matchContentService.selectMatchContentById(id));
    }

    /**
     * 新增对局信息
     */
    @PreAuthorize("@ss.hasPermi('tta:content:add')")
    @Log(title = "对局信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MatchContent matchContent)
    {
        return toAjax(matchContentService.insertMatchContent(matchContent));
    }

    /**
     * 修改对局信息
     */
    @PreAuthorize("@ss.hasPermi('tta:content:edit')")
    @Log(title = "对局信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MatchContent matchContent)
    {
        return toAjax(matchContentService.updateMatchContent(matchContent));
    }

    /**
     * 删除对局信息
     */
    @PreAuthorize("@ss.hasPermi('tta:content:remove')")
    @Log(title = "对局信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(matchContentService.deleteMatchContentByIds(ids));
    }
}
