import request from '@/utils/request'

// 查询好友列表列表
export function listFriends(query) {
  return request({
    url: '/tta/friends/list',
    method: 'get',
    params: query
  })
}

// 查询好友列表详细
export function getFriends(chatId) {
  return request({
    url: '/tta/friends/' + chatId,
    method: 'get'
  })
}

// 新增好友列表
export function addFriends(data) {
  return request({
    url: '/tta/friends',
    method: 'post',
    data: data
  })
}

// 修改好友列表
export function updateFriends(data) {
  return request({
    url: '/tta/friends',
    method: 'put',
    data: data
  })
}

// 删除好友列表
export function delFriends(chatId) {
  return request({
    url: '/tta/friends/' + chatId,
    method: 'delete'
  })
}
