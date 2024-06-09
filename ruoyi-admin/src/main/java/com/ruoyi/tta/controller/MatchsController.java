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
import com.ruoyi.tta.domain.Matchs;
import com.ruoyi.tta.service.IMatchsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 对局列表Controller
 * 
 * @author 清
 * @date 2024-04-04
 */
@RestController
@RequestMapping("/tta/matchs")
public class MatchsController extends BaseController
{
    @Autowired
    private IMatchsService matchsService;

    /**
     * 查询对局列表列表
     */
    @PreAuthorize("@ss.hasPermi('tta:matchs:list')")
    @GetMapping("/list")
    public TableDataInfo list(Matchs matchs)
    {
        startPage();
        List<Matchs> list = matchsService.selectMatchsList(matchs);
        return getDataTable(list);
    }

    /**
     * 导出对局列表列表
     */
    @PreAuthorize("@ss.hasPermi('tta:matchs:export')")
    @Log(title = "对局列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Matchs matchs)
    {
        List<Matchs> list = matchsService.selectMatchsList(matchs);
        ExcelUtil<Matchs> util = new ExcelUtil<Matchs>(Matchs.class);
        util.exportExcel(response, list, "对局列表数据");
    }

    /**
     * 获取对局列表详细信息
     */
    @PreAuthorize("@ss.hasPermi('tta:matchs:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(matchsService.selectMatchsById(id));
    }

    /**
     * 新增对局列表
     */
    @PreAuthorize("@ss.hasPermi('tta:matchs:add')")
    @Log(title = "对局列表", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Matchs matchs)
    {
        return toAjax(matchsService.insertMatchs(matchs));
    }

    /**
     * 修改对局列表
     */
    @PreAuthorize("@ss.hasPermi('tta:matchs:edit')")
    @Log(title = "对局列表", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Matchs matchs)
    {
        return toAjax(matchsService.updateMatchs(matchs));
    }

    /**
     * 删除对局列表
     */
    @PreAuthorize("@ss.hasPermi('tta:matchs:remove')")
    @Log(title = "对局列表", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(matchsService.deleteMatchsByIds(ids));
    }
}
