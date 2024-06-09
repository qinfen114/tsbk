<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="对局id" prop="matchId">
        <el-input
          v-model="queryParams.matchId"
          placeholder="请输入对局id"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="用户id" prop="userId">
        <el-input
          v-model="queryParams.userId"
          placeholder="请输入用户id"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="粮食" prop="food">
        <el-input
          v-model="queryParams.food"
          placeholder="请输入粮食"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="粮食产量" prop="foodAdd">
        <el-input
          v-model="queryParams.foodAdd"
          placeholder="请输入粮食产量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="矿" prop="mine">
        <el-input
          v-model="queryParams.mine"
          placeholder="请输入矿"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="矿产量" prop="mineAdd">
        <el-input
          v-model="queryParams.mineAdd"
          placeholder="请输入矿产量"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="科技" prop="science">
        <el-input
          v-model="queryParams.science"
          placeholder="请输入科技"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="科学增速" prop="scienceAdd">
        <el-input
          v-model="queryParams.scienceAdd"
          placeholder="请输入科学增速"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="文化" prop="culture">
        <el-input
          v-model="queryParams.culture"
          placeholder="请输入文化"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="文化增速" prop="cultureAdd">
        <el-input
          v-model="queryParams.cultureAdd"
          placeholder="请输入文化增速"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="白点" prop="wirtePoint">
        <el-input
          v-model="queryParams.wirtePoint"
          placeholder="请输入白点"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="红点" prop="redPoint">
        <el-input
          v-model="queryParams.redPoint"
          placeholder="请输入红点"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="军阵" prop="formationId">
        <el-input
          v-model="queryParams.formationId"
          placeholder="请输入军阵"
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
          v-hasPermi="['tta:userinfo:add']"
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
          v-hasPermi="['tta:userinfo:edit']"
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
          v-hasPermi="['tta:userinfo:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['tta:userinfo:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="userinfoList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="id" align="center" prop="id" />
      <el-table-column label="对局id" align="center" prop="matchId" />
      <el-table-column label="用户id" align="center" prop="userId" />
      <el-table-column label="粮食" align="center" prop="food" />
      <el-table-column label="粮食产量" align="center" prop="foodAdd" />
      <el-table-column label="矿" align="center" prop="mine" />
      <el-table-column label="矿产量" align="center" prop="mineAdd" />
      <el-table-column label="科技" align="center" prop="science" />
      <el-table-column label="科学增速" align="center" prop="scienceAdd" />
      <el-table-column label="文化" align="center" prop="culture" />
      <el-table-column label="文化增速" align="center" prop="cultureAdd" />
      <el-table-column label="农场" align="center" prop="agriculture" />
      <el-table-column label="矿山" align="center" prop="minerals" />
      <el-table-column label="实验室" align="center" prop="lab" />
      <el-table-column label="宗教" align="center" prop="religion" />
      <el-table-column label="印刷" align="center" prop="print" />
      <el-table-column label="角斗场" align="center" prop="abattoir" />
      <el-table-column label="戏剧" align="center" prop="drama" />
      <el-table-column label="蓝卡" align="center" prop="blueCard" />
      <el-table-column label="步兵" align="center" prop="swordman" />
      <el-table-column label="骑兵" align="center" prop="knight" />
      <el-table-column label="炮兵" align="center" prop="artillerist" />
      <el-table-column label="飞机" align="center" prop="plane" />
      <el-table-column label="手卡" align="center" prop="hardCard" />
      <el-table-column label="白点" align="center" prop="wirtePoint" />
      <el-table-column label="红点" align="center" prop="redPoint" />
      <el-table-column label="奇迹" align="center" prop="miracleList" />
      <el-table-column label="领袖" align="center" prop="leader" />
      <el-table-column label="军阵" align="center" prop="formationId" />
      <el-table-column label="政体" align="center" prop="polity" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['tta:userinfo:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['tta:userinfo:remove']"
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

    <!-- 添加或修改对局面板对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="对局id" prop="matchId">
          <el-input v-model="form.matchId" placeholder="请输入对局id" />
        </el-form-item>
        <el-form-item label="用户id" prop="userId">
          <el-input v-model="form.userId" placeholder="请输入用户id" />
        </el-form-item>
        <el-form-item label="粮食" prop="food">
          <el-input v-model="form.food" placeholder="请输入粮食" />
        </el-form-item>
        <el-form-item label="粮食产量" prop="foodAdd">
          <el-input v-model="form.foodAdd" placeholder="请输入粮食产量" />
        </el-form-item>
        <el-form-item label="矿" prop="mine">
          <el-input v-model="form.mine" placeholder="请输入矿" />
        </el-form-item>
        <el-form-item label="矿产量" prop="mineAdd">
          <el-input v-model="form.mineAdd" placeholder="请输入矿产量" />
        </el-form-item>
        <el-form-item label="科技" prop="science">
          <el-input v-model="form.science" placeholder="请输入科技" />
        </el-form-item>
        <el-form-item label="科学增速" prop="scienceAdd">
          <el-input v-model="form.scienceAdd" placeholder="请输入科学增速" />
        </el-form-item>
        <el-form-item label="文化" prop="culture">
          <el-input v-model="form.culture" placeholder="请输入文化" />
        </el-form-item>
        <el-form-item label="文化增速" prop="cultureAdd">
          <el-input v-model="form.cultureAdd" placeholder="请输入文化增速" />
        </el-form-item>
        <el-form-item label="农场" prop="agriculture">
          <el-input v-model="form.agriculture" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="矿山" prop="minerals">
          <el-input v-model="form.minerals" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="实验室" prop="lab">
          <el-input v-model="form.lab" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="宗教" prop="religion">
          <el-input v-model="form.religion" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="印刷" prop="print">
          <el-input v-model="form.print" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="角斗场" prop="abattoir">
          <el-input v-model="form.abattoir" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="戏剧" prop="drama">
          <el-input v-model="form.drama" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="蓝卡" prop="blueCard">
          <el-input v-model="form.blueCard" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="步兵" prop="swordman">
          <el-input v-model="form.swordman" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="骑兵" prop="knight">
          <el-input v-model="form.knight" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="炮兵" prop="artillerist">
          <el-input v-model="form.artillerist" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="飞机" prop="plane">
          <el-input v-model="form.plane" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="手卡" prop="hardCard">
          <el-input v-model="form.hardCard" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="白点" prop="wirtePoint">
          <el-input v-model="form.wirtePoint" placeholder="请输入白点" />
        </el-form-item>
        <el-form-item label="红点" prop="redPoint">
          <el-input v-model="form.redPoint" placeholder="请输入红点" />
        </el-form-item>
        <el-form-item label="奇迹" prop="miracleList">
          <el-input v-model="form.miracleList" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="领袖" prop="leader">
          <el-input v-model="form.leader" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="军阵" prop="formationId">
          <el-input v-model="form.formationId" placeholder="请输入军阵" />
        </el-form-item>
        <el-form-item label="政体" prop="polity">
          <el-input v-model="form.polity" type="textarea" placeholder="请输入内容" />
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
import { listUserinfo, getUserinfo, delUserinfo, addUserinfo, updateUserinfo } from "@/api/tta/userinfo";

export default {
  name: "Userinfo",
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
      // 对局面板表格数据
      userinfoList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        matchId: null,
        userId: null,
        food: null,
        foodAdd: null,
        mine: null,
        mineAdd: null,
        science: null,
        scienceAdd: null,
        culture: null,
        cultureAdd: null,
        agriculture: null,
        minerals: null,
        lab: null,
        religion: null,
        print: null,
        abattoir: null,
        drama: null,
        blueCard: null,
        swordman: null,
        knight: null,
        artillerist: null,
        plane: null,
        hardCard: null,
        wirtePoint: null,
        redPoint: null,
        miracleList: null,
        leader: null,
        formationId: null,
        polity: null
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
    /** 查询对局面板列表 */
    getList() {
      this.loading = true;
      listUserinfo(this.queryParams).then(response => {
        this.userinfoList = response.rows;
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
        matchId: null,
        userId: null,
        food: null,
        foodAdd: null,
        mine: null,
        mineAdd: null,
        science: null,
        scienceAdd: null,
        culture: null,
        cultureAdd: null,
        agriculture: null,
        minerals: null,
        lab: null,
        religion: null,
        print: null,
        abattoir: null,
        drama: null,
        blueCard: null,
        swordman: null,
        knight: null,
        artillerist: null,
        plane: null,
        hardCard: null,
        wirtePoint: null,
        redPoint: null,
        miracleList: null,
        leader: null,
        formationId: null,
        polity: null
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
      this.title = "添加对局面板";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getUserinfo(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改对局面板";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateUserinfo(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addUserinfo(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除对局面板编号为"' + ids + '"的数据项？').then(function() {
        return delUserinfo(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('tta/userinfo/export', {
        ...this.queryParams
      }, `userinfo_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
