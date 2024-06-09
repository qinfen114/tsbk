<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="当前时代" prop="nowEra">
        <el-input
          v-model="queryParams.nowEra"
          placeholder="请输入当前时代"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:content:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:content:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:content:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:content:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="contentList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="id" align="center" prop="id" />
      <el-table-column label="A时代黑卡" align="center" prop="aEraBlackCards" />
      <el-table-column label="A时代卡" align="center" prop="aEraCards" />
      <el-table-column label="1时代黑卡" align="center" prop="oneEraBlackCards" />
      <el-table-column label="1时代卡" align="center" prop="oneEraCards" />
      <el-table-column label="2时代黑卡" align="center" prop="twoEraBlackCards" />
      <el-table-column label="2时代卡" align="center" prop="twoEraCards" />
      <el-table-column label="3时代黑卡" align="center" prop="threeEraBlackCards" />
      <el-table-column label="3时代卡" align="center" prop="threeEraCards" />
      <el-table-column label="当前时代" align="center" prop="nowEra" />
      <el-table-column label="阵型列表" align="center" prop="formationList" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:content:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:content:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    
    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改对局信息对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="A时代黑卡" prop="aEraBlackCards">
          <el-input v-model="form.aEraBlackCards" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="A时代卡" prop="aEraCards">
          <el-input v-model="form.aEraCards" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="1时代黑卡" prop="oneEraBlackCards">
          <el-input v-model="form.oneEraBlackCards" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="1时代卡" prop="oneEraCards">
          <el-input v-model="form.oneEraCards" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="2时代黑卡" prop="twoEraBlackCards">
          <el-input v-model="form.twoEraBlackCards" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="2时代卡" prop="twoEraCards">
          <el-input v-model="form.twoEraCards" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="3时代黑卡" prop="threeEraBlackCards">
          <el-input v-model="form.threeEraBlackCards" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="3时代卡" prop="threeEraCards">
          <el-input v-model="form.threeEraCards" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="当前时代" prop="nowEra">
          <el-input v-model="form.nowEra" placeholder="请输入当前时代" />
        </el-form-item>
        <el-form-item label="阵型列表" prop="formationList">
          <el-input v-model="form.formationList" type="textarea" placeholder="请输入内容" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listContent, getContent, delContent, addContent, updateContent } from "@/api/system/content";

export default {
  name: "Content",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 对局信息表格数据
      contentList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        aEraBlackCards: null,
        aEraCards: null,
        oneEraBlackCards: null,
        oneEraCards: null,
        twoEraBlackCards: null,
        twoEraCards: null,
        threeEraBlackCards: null,
        threeEraCards: null,
        nowEra: null,
        formationList: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询对局信息列表 */
    getList() {
      this.loading = true;
      listContent(this.queryParams).then(response => {
        this.contentList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        aEraBlackCards: null,
        aEraCards: null,
        oneEraBlackCards: null,
        oneEraCards: null,
        twoEraBlackCards: null,
        twoEraCards: null,
        threeEraBlackCards: null,
        threeEraCards: null,
        nowEra: null,
        formationList: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加对局信息";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getContent(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改对局信息";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateContent(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addContent(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除对局信息编号为"' + ids + '"的数据项？').then(function() {
        return delContent(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/content/export', {
        ...this.queryParams
      }, `content_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
