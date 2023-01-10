
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DeliveryMgmtManager from "./components/listers/DeliveryMgmtCards"
import DeliveryMgmtDetail from "./components/listers/DeliveryMgmtDetail"

import InventoryMgmtManager from "./components/listers/InventoryMgmtCards"
import InventoryMgmtDetail from "./components/listers/InventoryMgmtDetail"

import OrderMgmtManager from "./components/listers/OrderMgmtCards"
import OrderMgmtDetail from "./components/listers/OrderMgmtDetail"

import MenuSearchView from "./components/MenuSearchView"
import MenuSearchViewDetail from "./components/MenuSearchViewDetail"
import OrderHistoryView from "./components/OrderHistoryView"
import OrderHistoryViewDetail from "./components/OrderHistoryViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/deliveryMgmts',
                name: 'DeliveryMgmtManager',
                component: DeliveryMgmtManager
            },
            {
                path: '/deliveryMgmts/:id',
                name: 'DeliveryMgmtDetail',
                component: DeliveryMgmtDetail
            },

            {
                path: '/inventoryMgmts',
                name: 'InventoryMgmtManager',
                component: InventoryMgmtManager
            },
            {
                path: '/inventoryMgmts/:id',
                name: 'InventoryMgmtDetail',
                component: InventoryMgmtDetail
            },

            {
                path: '/orderMgmts',
                name: 'OrderMgmtManager',
                component: OrderMgmtManager
            },
            {
                path: '/orderMgmts/:id',
                name: 'OrderMgmtDetail',
                component: OrderMgmtDetail
            },

            {
                path: '/menuSearches',
                name: 'MenuSearchView',
                component: MenuSearchView
            },
            {
                path: '/menuSearches/:id',
                name: 'MenuSearchViewDetail',
                component: MenuSearchViewDetail
            },
            {
                path: '/orderHistories',
                name: 'OrderHistoryView',
                component: OrderHistoryView
            },
            {
                path: '/orderHistories/:id',
                name: 'OrderHistoryViewDetail',
                component: OrderHistoryViewDetail
            },


    ]
})
