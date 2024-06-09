import request from '@/utils/request'

// 查询对局列表列表
export function listMatchs(query) {
  return request({
    url: '/tta/matchs/list',
    method: 'get',
    params: query
  })
}

// 查询对局列表详细
export function getMatchs(id) {
  return request({
    url: '/tta/matchs/' + id,
    method: 'get'
  })
}

// 新增对局列表
export function addMatchs(data) {
  return request({
    url: '/tta/matchs',
    method: 'post',
    data: data
  })
}

// 修改对局列表
export function updateMatchs(data) {
  return request({
    url: '/tta/matchs',
    method: 'put',
    data: data
  })
}

// 删除对局列表
export function delMatchs(id) {
  return request({
    url: '/tta/matchs/' + id,
    method: 'delete'
  })
}
