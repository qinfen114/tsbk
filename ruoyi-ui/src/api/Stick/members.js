import request from '@/utils/request'

// 查询成员列表列表
export function listMembers(query) {
  return request({
    url: '/Stick/members/list',
    method: 'get',
    params: query
  })
}

// 查询成员列表详细
export function getMembers(uid) {
  return request({
    url: '/Stick/members/' + uid,
    method: 'get'
  })
}

// 新增成员列表
export function addMembers(data) {
  return request({
    url: '/Stick/members',
    method: 'post',
    data: data
  })
}

// 修改成员列表
export function updateMembers(data) {
  return request({
    url: '/Stick/members',
    method: 'put',
    data: data
  })
}

// 删除成员列表
export function delMembers(uid) {
  return request({
    url: '/Stick/members/' + uid,
    method: 'delete'
  })
}
