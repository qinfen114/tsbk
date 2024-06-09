import request from '@/utils/request'

// 查询对局面板列表
export function listUserinfo(query) {
  return request({
    url: '/tta/userinfo/list',
    method: 'get',
    params: query
  })
}

// 查询对局面板详细
export function getUserinfo(id) {
  return request({
    url: '/tta/userinfo/' + id,
    method: 'get'
  })
}

// 新增对局面板
export function addUserinfo(data) {
  return request({
    url: '/tta/userinfo',
    method: 'post',
    data: data
  })
}

// 修改对局面板
export function updateUserinfo(data) {
  return request({
    url: '/tta/userinfo',
    method: 'put',
    data: data
  })
}

// 删除对局面板
export function delUserinfo(id) {
  return request({
    url: '/tta/userinfo/' + id,
    method: 'delete'
  })
}
