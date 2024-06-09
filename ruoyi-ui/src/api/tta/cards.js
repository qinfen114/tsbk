import request from '@/utils/request'

// 查询卡牌列表列表
export function listCards(query) {
  return request({
    url: '/tta/cards/list',
    method: 'get',
    params: query
  })
}

// 查询卡牌列表详细
export function getCards(id) {
  return request({
    url: '/tta/cards/' + id,
    method: 'get'
  })
}

// 新增卡牌列表
export function addCards(data) {
  return request({
    url: '/tta/cards',
    method: 'post',
    data: data
  })
}

// 修改卡牌列表
export function updateCards(data) {
  return request({
    url: '/tta/cards',
    method: 'put',
    data: data
  })
}

// 删除卡牌列表
export function delCards(id) {
  return request({
    url: '/tta/cards/' + id,
    method: 'delete'
  })
}
