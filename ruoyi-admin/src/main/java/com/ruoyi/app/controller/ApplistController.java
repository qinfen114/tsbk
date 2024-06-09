package com.ruoyi.app.controller;

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
import com.ruoyi.app.domain.Applist;
import com.ruoyi.app.service.IApplistService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 软件库Controller
 * 
 * @author ruoyi
 * @date 2024-04-05
 */
@RestController
@RequestMapping("/app/applist")
public class ApplistController extends BaseController
{
    @Autowired
    private IApplistService applistService;

    /**
     * 查询软件库列表
     */
    @PreAuthorize("@ss.hasPermi('app:applist:list')")
    @GetMapping("/list")
    public TableDataInfo list(Applist applist)
    {
        startPage();
        List<Applist> list = applistService.selectApplistList(applist);
        return getDataTable(list);
    }

    /**
     * 导出软件库列表
     */
    @PreAuthorize("@ss.hasPermi('app:applist:export')")
    @Log(title = "软件库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Applist applist)
    {
        List<Applist> list = applistService.selectApplistList(applist);
        ExcelUtil<Applist> util = new ExcelUtil<Applist>(Applist.class);
        util.exportExcel(response, list, "软件库数据");
    }

    /**
     * 获取软件库详细信息
     */
    @PreAuthorize("@ss.hasPermi('app:applist:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(applistService.selectApplistById(id));
    }

    /**
     * 新增软件库
     */
    @PreAuthorize("@ss.hasPermi('app:applist:add')")
    @Log(title = "软件库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Applist applist)
    {
        return toAjax(applistService.insertApplist(applist));
    }

    /**
     * 修改软件库
     */
    @PreAuthorize("@ss.hasPermi('app:applist:edit')")
    @Log(title = "软件库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Applist applist)
    {
        return toAjax(applistService.updateApplist(applist));
    }

    /**
     * 删除软件库
     */
    @PreAuthorize("@ss.hasPermi('app:applist:remove')")
    @Log(title = "软件库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(applistService.deleteApplistByIds(ids));
    }
}
